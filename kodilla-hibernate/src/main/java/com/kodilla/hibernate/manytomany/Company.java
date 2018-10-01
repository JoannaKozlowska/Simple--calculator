package com.kodilla.hibernate.manytomany;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.stereotype.Service;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedNativeQuery(
        name = "Company.findByFirstThreeLetters",
        query = "SELECT COMPANY_ID, COMPANY_NAME from  COMPANIES WHERE COMPANY_NAME like " +
                "concat('%', concat(:COMPANY_NAME, '%')) ",
        resultClass = Company.class
)
//Nr 20
@NamedQuery(
        name = "Company.findByCompanyPartName",
        query = "FROM Company WHERE name like CONCAT('%',:PART_NAME, '%')"
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
    @ManyToMany(
            cascade = CascadeType.ALL,
            mappedBy = "companies"
    )
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
