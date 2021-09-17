package com.sean.hr.exception

import java.util.*

data class ErrorMsg(
    var timestamp: Date = Date(),
    var msg: String = ""
)
