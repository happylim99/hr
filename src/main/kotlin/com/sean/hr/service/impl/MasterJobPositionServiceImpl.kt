package com.sean.hr.service.impl

import com.sean.hr.annotation.Log
import com.sean.hr.config.AopConfig
import com.sean.hr.entity.MasterJobPosition
import com.sean.hr.model.Message
import com.sean.hr.repo.MasterDepartmentRepo
import com.sean.hr.repo.MasterJobPositionRepo
import com.sean.hr.service.MasterDepartmentService
import com.sean.hr.service.MasterJobPositionService
import com.sean.hr.ui.req.MasterDepartmentUptReq
import com.sean.hr.ui.req.MasterJobPositionCrtReq
import com.sean.hr.ui.req.MasterJobPositionUptReq
import com.sean.hr.ui.res.MasterDepartmentRes
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.BeanUtils
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MasterJobPositionServiceImpl(
    private val repo: MasterJobPositionRepo
): MasterJobPositionService {

    private val log: Logger = LoggerFactory.getLogger(MasterJobPositionServiceImpl::class.java)

    override fun createOne(req: MasterJobPositionCrtReq): MasterJobPosition {
        log.info(Throwable().stackTrace[0].methodName)
        var obj = MasterJobPosition()
        BeanUtils.copyProperties(req, obj)
        return repo.save(obj)
    }

    override fun updateOne(req: MasterJobPositionUptReq): MasterJobPosition {
        log.info(Throwable().stackTrace[0].methodName)
        var obj = repo.findByIdOrNull(req.id)
        obj?.let {
            BeanUtils.copyProperties(req, it as Any, "id")
            return repo.save(obj)
        } ?: throw Exception("MasterJobPosition with id ${req.id} not found")

    }

    override fun showOne(id: Long): MasterJobPosition {
        log.info(Throwable().stackTrace[0].methodName)
        repo.findByIdOrNull(id)?.let {
            return it
        } ?:
        throw Exception("MasterJobPosition with id ${id} not found")
    }

    override fun showAll(): List<MasterJobPosition> {
        log.info(Throwable().stackTrace[0].methodName)
        return repo.findAll()
    }

}