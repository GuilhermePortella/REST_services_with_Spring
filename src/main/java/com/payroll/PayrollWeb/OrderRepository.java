package com.payroll.PayrollWeb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Guilherme
 */
interface OrderRepository extends JpaRepository<Order, Long> {
    
}
