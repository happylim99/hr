package com.sean.hr.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.BeanUtils
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull

//abstract class CrudCopy<LOGC, ENTITY, RES, REPO: JpaRepository<ENTITY, Long>>(
//    logC: Class<LOGC>,
//    private val entity: Class<ENTITY>,
//    private val resType: Class<RES>
//) {
//    private val log: Logger = LoggerFactory.getLogger(logC)
//
//    fun <T: Any> createOne(req: T): RES {
//        log.info("Generic createOne")
//        var dbObj = entity.newInstance()
//        BeanUtils.copyProperties(req, dbObj as Any)
//        dbObj = getRepo().save(dbObj)
//        var res = resType.newInstance()
//        BeanUtils.copyProperties(dbObj as Any, res as Any)
//        return res
//    }
//
//    fun showOne(id: Long): RES {
//        log.info("Generic showOne")
//        var dbObj = getRepo().findByIdOrNull(id)
//        var res = resType.newInstance()
//        BeanUtils.copyProperties(dbObj as Any, res as Any)
//        return res
//    }
//
//    fun <T: Any> updateOne(req: T): RES {
//        log.info("Generic updateOne")
//        var dbObj = getUpdateObj(req)
//        BeanUtils.copyProperties(req, dbObj as Any)
//        dbObj = getRepo().save(dbObj)
//        var res = resType.newInstance()
//        BeanUtils.copyProperties(dbObj as Any, res as Any)
//        return res
//    }
//
//    fun showAll(): List<RES>? {
//        log.info("Generic showAll")
//        var dbObjs: List<ENTITY>? = getRepo().findAll()
//        var resList = mutableListOf<RES>()
//        dbObjs?.let {
//            var res = resType.newInstance()
//            BeanUtils.copyProperties(dbObjs as Any, res as Any)
//            resList.add(res)
//        }
//        return resList
//    }
//
//    abstract fun getRepo(): REPO
//    abstract fun <T> getUpdateObj(req: T): ENTITY?
//}