package com.sean.hr.service

import com.sean.hr.entity.MasterDepartment
import com.sean.hr.ui.req.MasterDepartmentCrtReq
import com.sean.hr.ui.req.MasterDepartmentUptReq

interface MasterDepartmentService {

    fun createOne(req: MasterDepartmentCrtReq): MasterDepartment
    fun updateOne(req: MasterDepartmentUptReq): MasterDepartment
    fun showOne(id: Long): MasterDepartment?
    fun showAll(): List<MasterDepartment>?

}