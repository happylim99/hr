package com.sean.hr.annotation

import org.springframework.stereotype.Component
import java.lang.annotation.Documented

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Log