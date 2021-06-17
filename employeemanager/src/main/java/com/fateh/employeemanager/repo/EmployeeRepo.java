package com.fateh.employeemanager.repo;

import com.fateh.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(long id);

    Optional<Employee> findEmployeeById(long id);
}
