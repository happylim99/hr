package com.sean.hr.repo

import com.sean.hr.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepo: JpaRepository<Employee, Long> {

//    fun findByEmail(email: String): Employee?
//    fun findByUserId(id: String): Employee?
}