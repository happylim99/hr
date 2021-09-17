package com.sean.hr.config

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Aspect
@Component
class AopConfig {

    private val log: Logger = LoggerFactory.getLogger(javaClass)

//    @Before("execution(* com.sean.hr.controller.*.*(..))")
//    fun before() {
//        log.info("before")
//
//    }

    @Around("execution(* com.sean.hr.controller.*.*(..))")
    fun logController(joinPoint: ProceedingJoinPoint): Any {
        return logExecutionTime(joinPoint)
    }

    @Around("@annotation(com.sean.hr.annotation.Log)")
    fun logAnnotation(joinPoint: ProceedingJoinPoint): Any {
        return logExecutionTime(joinPoint)
    }

//    @Around("@annotation(com.sean.hr.annotation.Log)")
    private fun logExecutionTime(joinPoint: ProceedingJoinPoint): Any {
        val start = System.currentTimeMillis()
        val signature = joinPoint.signature.toShortString()
        val result = try {
            with(StringBuilder("start -> Executing $signature, ")) {
                appendParameters(joinPoint.args)
                log.info(toString())
            }
            joinPoint.proceed()
        } catch (throwable: Throwable) {
            log.error("*** Exception during executing $signature,", throwable)
            throw throwable
        }
        val duration = System.currentTimeMillis() - start
        log.info("end -> Finished executing: $signature, returned: '$result', duration: $duration ms")
        return result
    }

    private fun StringBuilder.appendParameters(args: Array<Any>) {
        append("parameters: [")
        args.forEachIndexed { i, p ->
            append(p.javaClass.simpleName).append("(").append(p.toString()).append(")")
            if (i < args.size - 1) append(", ")
        }
        append("]")
    }

}
