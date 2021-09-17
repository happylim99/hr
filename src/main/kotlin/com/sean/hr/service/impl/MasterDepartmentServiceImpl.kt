package com.sean.hr.service.impl

import com.sean.hr.entity.MasterDepartment
import com.sean.hr.repo.MasterDepartmentRepo
import com.sean.hr.service.MasterDepartmentService
import com.sean.hr.ui.req.MasterDepartmentCrtReq
import com.sean.hr.ui.req.MasterDepartmentUptReq
import com.sean.hr.ui.res.MasterDepartmentRes
import org.springframework.beans.BeanUtils
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MasterDepartmentServiceImpl(
    private val repo: MasterDepartmentRepo
): MasterDepartmentService {

    override fun createOne(req: MasterDepartmentCrtReq): MasterDepartment {
        var obj = MasterDepartment()
        BeanUtils.copyProperties(req, obj)
        return repo.save(obj)
    }

    override fun updateOne(req: MasterDepartmentUptReq): MasterDepartment {
        var obj = repo.findByIdOrNull(req.id)
        BeanUtils.copyProperties(req, obj as Any, "id")
        return repo.save(obj)
    }

    override fun showOne(id: Long): MasterDepartment? {
        return repo.findByIdOrNull(id)
    }

    override fun showAll(): List<MasterDepartment>? {
        return repo.findAll()
    }

}