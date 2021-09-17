package com.sean.hr.service

import com.sean.hr.entity.MasterJobPosition
import com.sean.hr.ui.req.MasterDepartmentCrtReq
import com.sean.hr.ui.req.MasterDepartmentUptReq
import com.sean.hr.ui.req.MasterJobPositionCrtReq
import com.sean.hr.ui.req.MasterJobPositionUptReq
import com.sean.hr.ui.res.MasterDepartmentRes

interface MasterJobPositionService {

    fun createOne(req: MasterJobPositionCrtReq): MasterJobPosition
    fun updateOne(req: MasterJobPositionUptReq): MasterJobPosition
    fun showOne(id: Long): MasterJobPosition
    fun showAll(): List<MasterJobPosition>

}