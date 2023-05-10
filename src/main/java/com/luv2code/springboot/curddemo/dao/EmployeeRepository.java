package com.luv2code.springboot.curddemo.dao;

import com.luv2code.springboot.curddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//no need to write any code


    //http://localhost:8080/employee?page=1&size=3
    //http://localhost:8080/employee?sort=lastName ,Desc
    //http://localhost:8080/employee?sort=firstName ,Asec
}
