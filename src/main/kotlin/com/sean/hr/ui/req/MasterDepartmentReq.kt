package com.sean.hr.ui.req

data class MasterDepartmentCrtReq(
    var name: String? = null,
    var description: String? = null
)

data class MasterDepartmentUptReq(
    var id: Long = 0,
    var name: String? = null,
    var description: String? = null
)
