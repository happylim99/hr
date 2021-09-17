package com.sean.hr.controller

import com.sean.hr.entity.MasterDepartment
import com.sean.hr.service.MasterDepartmentService
import com.sean.hr.ui.req.MasterDepartmentCrtReq
import com.sean.hr.ui.req.MasterDepartmentUptReq
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/masterDepartment")
class MasterDepartmentController(
    val mdSrv: MasterDepartmentService
) {

    @PostMapping("/createOne")
    @ResponseStatus(HttpStatus.CREATED)
    fun createOne(@RequestBody req: MasterDepartmentCrtReq): ResponseEntity<MasterDepartment> {
        return ResponseEntity.ok(mdSrv.createOne(req))
    }

    @PostMapping("/updateOne")
    fun updateOne(@RequestBody req: MasterDepartmentUptReq): ResponseEntity<MasterDepartment> {
        return ResponseEntity.ok(mdSrv.updateOne(req))
    }

    @GetMapping("/showAll")
    fun showAll(): ResponseEntity<List<MasterDepartment>> {
        return ResponseEntity.ok(mdSrv.showAll())
    }

    @GetMapping("/showOne/{id}")
    fun showOne(@PathVariable id: Long) =
        ResponseEntity.ok(mdSrv.showOne(id))
}