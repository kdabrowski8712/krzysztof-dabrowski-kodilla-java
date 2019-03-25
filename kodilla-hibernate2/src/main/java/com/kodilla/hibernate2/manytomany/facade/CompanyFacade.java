package com.kodilla.hibernate2.manytomany.facade;

import com.kodilla.hibernate2.manytomany.Company;
import com.kodilla.hibernate2.manytomany.Employee;
import com.kodilla.hibernate2.manytomany.dao.CompanyDao;
import com.kodilla.hibernate2.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyByPartOfName(String namePArt) {

        List<Company> results = companyDao.fineByPartOfCompanyNameLike(namePArt);
        return  results;
    }

    public List<Employee> findEmployeeByPartOfName(String namePArt) {

        List<Employee> result = employeeDao.fineByPartOfEmployeeNameLike(namePArt);
        return result;
    }

}
