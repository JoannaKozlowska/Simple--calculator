package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeAndCompanyFacade {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;


    public List<Company> findCompanyByParam(String param1) {
        List<Company> companiesFound = companyDao.findByCompanyPartName(param1);
        return companiesFound;
    }
    public List<Employee> findEmployeeByParam(String param2) {
        List<Employee> employeesFound = employeeDao.findByLastNamePart(param2);
        return employeesFound;
    }

}
