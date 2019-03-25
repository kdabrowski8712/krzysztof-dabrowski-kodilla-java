package com.kodilla.hibernate2.manytomany.facade;

import com.kodilla.hibernate2.manytomany.Company;
import com.kodilla.hibernate2.manytomany.Employee;
import com.kodilla.hibernate2.manytomany.dao.CompanyDao;
import com.kodilla.hibernate2.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConpanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void getCompaniesByNamePartTest() {

        //Given
        String RESTAURANT_NAME = "MY WWW RESTAURANT";
        Company newCompany = new Company(RESTAURANT_NAME);

        Employee newEmployee = new Employee("Kazik","ZBogdanca");

        newCompany.getEmployees().add(newEmployee);
        newEmployee.getCompanies().add(newCompany);


        //when

        companyDao.save(newCompany);
        int companyID = newCompany.getId();

        List<Company> resultSet = companyFacade.findCompanyByPartOfName("WWW");

        //Then
        Assert.assertEquals(1,resultSet.size());
        Assert.assertEquals(RESTAURANT_NAME,resultSet.get(0).getName());

        //CleanUP
        companyDao.delete(newCompany);

    }

    @Test
    public void getEmployeesByNamePartTest() {
        //Given
        Employee newEmployee = new Employee("Zenobi","Chmielnicki2222");

        //when
        employeeDao.save(newEmployee);

        List<Employee> resultSet = employeeDao.findEmployeeByName("Chmielnicki2222");

        int employeeToDeleteid = newEmployee.getId();

        //Then
        Assert.assertEquals(1,resultSet.size());
        Assert.assertEquals("Chmielnicki2222",resultSet.get(0).getLastname());

        //CleanUp
        employeeDao.delete(employeeToDeleteid);
    }
}
