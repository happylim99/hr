package com.sean.hr.repo

import com.sean.hr.entity.MasterDepartment
import org.springframework.data.jpa.repository.JpaRepository

interface MasterDepartmentRepo: JpaRepository<MasterDepartment, Long> {
}