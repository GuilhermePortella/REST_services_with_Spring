package com.payroll.PayrollWeb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Guilherme
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
