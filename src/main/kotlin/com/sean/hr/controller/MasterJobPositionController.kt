package com.sean.hr.controller

import com.sean.hr.annotation.Log
import com.sean.hr.entity.MasterJobPosition
import com.sean.hr.service.MasterJobPositionService
import com.sean.hr.service.impl.MasterJobPositionServiceImpl
import com.sean.hr.ui.req.MasterJobPositionCrtReq
import com.sean.hr.ui.req.MasterJobPositionUptReq
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import kotlin.jvm.Throws

@RestController
@CrossOrigin
@RequestMapping("/masterJobPosition")
class MasterJobPositionController @Autowired constructor(
    val mjpSrv: MasterJobPositionServiceImpl
) {
    @PostMapping("/createOne")
    @ResponseStatus(HttpStatus.CREATED)
    fun createOne(@RequestBody req: MasterJobPositionCrtReq): ResponseEntity<MasterJobPosition> {
        return ResponseEntity.ok(mjpSrv.createOne(req))
    }

    @PostMapping("/updateOne")
    fun updateOne(@RequestBody req: MasterJobPositionUptReq): ResponseEntity<MasterJobPosition> {
        return ResponseEntity.ok(mjpSrv.updateOne(req))
    }

    @GetMapping("/showAll")
    fun showAll(): ResponseEntity<List<MasterJobPosition>> {
        return ResponseEntity.ok(mjpSrv.showAll())
    }

    @GetMapping("/showOne/{id}")
    fun showOne(@PathVariable id: Long) =
        ResponseEntity.ok(mjpSrv.showOne(id))
}