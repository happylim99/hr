package com.sean.hr.log

import com.sean.hr.annotation.Slf4j
import com.sean.hr.annotation.Slf4j.Companion.log
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Slf4j
@Component
class LogUrl: OncePerRequestFilter() {
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        log.info("Endpoint -> ${request.getRequestURI()}")
        filterChain.doFilter(request, response)
    }
}
