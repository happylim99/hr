package com.sean.hr.exception

import java.lang.RuntimeException

class RException(
    private val msg: String
): RuntimeException(msg) {
}