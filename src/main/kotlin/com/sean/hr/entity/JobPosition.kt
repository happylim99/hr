package com.sean.hr.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
class JobPosition(): Auditable<String>(), Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(nullable = false)
    lateinit var position: String

    @Column(nullable = false)
    lateinit var positionDate: Date

    @Column(nullable = false)
    var active: Boolean = true

}