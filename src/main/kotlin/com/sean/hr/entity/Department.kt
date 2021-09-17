package com.sean.hr.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
class Department(): Auditable<String>(), Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(nullable = false)
    lateinit var department: String

    @Column(nullable = false)
    lateinit var joinDate: Date

    @Column(nullable = false)
    var active: Boolean = true

    @Column(nullable = false)
    @OneToMany(cascade = [CascadeType.ALL])
    lateinit var jobPosition: MutableList<JobPosition>

}