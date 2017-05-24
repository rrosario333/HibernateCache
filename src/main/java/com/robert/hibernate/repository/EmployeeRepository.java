package com.robert.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.robert.hibernate.enitites.Employee;

/**
 * Created by Robert.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
