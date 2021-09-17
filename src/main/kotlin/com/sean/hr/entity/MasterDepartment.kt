package com.sean.hr.entity

import java.io.Serializable
import javax.persistence.*

@Entity
class MasterDepartment(): Auditable<String>(), Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(length=20, nullable=false)
    lateinit var name: String

    @Column(length=50)
    lateinit var description: String

}