package com.sean.hr.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.BeanUtils
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull

//abstract class Crud<LOGC, ENTITY, REPO: JpaRepository<ENTITY, Long>>(
//    logC: Class<LOGC>,
//    private val entity: Class<ENTITY>
//) {
//    private val log: Logger = LoggerFactory.getLogger(logC)
//
//    fun <T: Any> createOne(req: T): ENTITY {
//        log.info("Generic createOne")
//        var dbObj = entity.newInstance()
//        BeanUtils.copyProperties(req, dbObj as Any)
//        return getRepo().save(dbObj)
//    }
//
//    fun showOne(id: Long): ENTITY? {
//        log.info("Generic showOne")
//        return getRepo().findByIdOrNull(id)
//    }
//
//    fun <T: Any> updateOne(req: T): ENTITY {
//        log.info("Generic updateOne")
//        var dbObj = getUpdateObj(req)
//        BeanUtils.copyProperties(req, dbObj as Any)
//        return getRepo().save(dbObj)
//    }
//
//    fun showAll(): List<ENTITY>? {
//        log.info("Generic showAll")
//        return getRepo().findAll()
//    }
//
//    abstract fun getRepo(): REPO
//    abstract fun <T> getUpdateObj(req: T): ENTITY?
//}