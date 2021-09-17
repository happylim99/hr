package com.sean.hr.repo

import com.sean.hr.entity.MasterJobPosition
import org.springframework.data.jpa.repository.JpaRepository

interface MasterJobPositionRepo: JpaRepository<MasterJobPosition, Long> {
}