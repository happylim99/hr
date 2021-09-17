package com.sean.hr.ui.req

data class MasterJobPositionCrtReq(
    var name: String? = null,
    var description: String? = null
)

data class MasterJobPositionUptReq(
    var id: Long = 0,
    var name: String? = null,
    var description: String? = null
)
