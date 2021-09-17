package com.sean.hr.service.impl

//import com.sean.hr.entity.MasterDepartment
//import com.sean.hr.repo.MasterDepartmentRepo
//import com.sean.hr.service.Crud
//import com.sean.hr.service.MasterDepartmentService
//import com.sean.hr.ui.req.MasterDepartmentUptReq
//import com.sean.hr.ui.res.MasterDepartmentRes
//import org.springframework.data.repository.findByIdOrNull
//import org.springframework.stereotype.Service
//
//@Service
//class MasterDepartmentServiceImpl_bak(
//    private val repo: MasterDepartmentRepo
//): Crud<MasterDepartmentService, MasterDepartment, MasterDepartmentRepo>(
//    MasterDepartmentService::class.java,
//    MasterDepartment::class.java
//) {
//    override fun getRepo() = repo
//
//    override fun <T> getUpdateObj(req: T): MasterDepartment? =
//        repo.findByIdOrNull((req as MasterDepartment).id) ?: throw Exception("MasterDepartment not found")
//
//}