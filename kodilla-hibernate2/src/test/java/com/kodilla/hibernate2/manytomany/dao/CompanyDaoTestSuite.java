package com.kodilla.hibernate2.manytomany.dao;

import com.kodilla.hibernate2.manytomany.Company;
import com.kodilla.hibernate2.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.delete(softwareMachineId);
        //    companyDao.delete(dataMaestersId);
        //    companyDao.delete(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    public void testFindEmployeeByLastName() {

        //Given
        Employee newEmployee = new Employee("Zenobi","Chmielnicki");

        //when
        employeeDao.save(newEmployee);

        List<Employee> resultSet = employeeDao.findEmployeeByName("Chmielnicki");

        int employeeToDeleteid = newEmployee.getId();

        //Then
        Assert.assertEquals(1,resultSet.size());
        Assert.assertEquals("Chmielnicki",resultSet.get(0).getLastname());

        //CleanUp
        employeeDao.delete(employeeToDeleteid);


    }

    @Test
    public void testFindCompanyByPartName() {

        //Given
        String RESTAURANT_NAME = "MY ABC RESTAURANT";
        Company newCompany = new Company(RESTAURANT_NAME);

        Employee newEmployee = new Employee("Kazik","ZBogdanca");

        newCompany.getEmployees().add(newEmployee);
        newEmployee.getCompanies().add(newCompany);


        //whenn

        companyDao.save(newCompany);
        int companyID = newCompany.getId();

        List<Company> resultSet = companyDao.fineByPartOfCompanyNameLike("ABC");

        //Then
        Assert.assertEquals(1,resultSet.size());
        Assert.assertEquals(RESTAURANT_NAME,resultSet.get(0).getName());

        //CleanUP
        companyDao.delete(newCompany);

    }
}