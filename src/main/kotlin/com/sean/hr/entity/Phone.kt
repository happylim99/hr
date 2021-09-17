package com.sean.hr.entity

import java.io.Serializable
import javax.persistence.*

@Entity
class Phone(): Auditable<String>(), Serializable {

    enum class PHONE_TYPE {
        HOME, MOBILE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(length=30, nullable=false)
    lateinit var phoneType: String

    @Column(length=30, nullable=false)
    lateinit var phoneNo: String
}