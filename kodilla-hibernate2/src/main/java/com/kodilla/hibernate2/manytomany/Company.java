package com.kodilla.hibernate2.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

//@NamedNativeQuery(
//        name = "Company.fineByPartOfCompanyName",
//        query = "SELECT * FROM companies " +
//                "WHERE locate(:NAMEPART,company_name)>0",
//        resultClass = Company.class
//)

@NamedNativeQuery(
        name = "Company.fineByPartOfCompanyNameLike",
        query = "SELECT * FROM companies " +
                "WHERE company_name LIKE concat(\"%\", :NAMEPART, \"%\")",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}