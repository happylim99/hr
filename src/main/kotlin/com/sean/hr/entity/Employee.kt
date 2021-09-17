package com.sean.hr.entity

import java.io.Serializable
import javax.persistence.*

@Entity
class Employee(): Auditable<String>(), Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(length=15, nullable=false)
    lateinit var employeeId: String

    @Column(length=30, nullable=false)
    lateinit var name: String

    @Column(length = 14, nullable = false)
    lateinit var ic: String

    @Column(length=25, nullable=false)
    lateinit var email: String

    @Column(length=100, nullable=false)
    lateinit var imageUrl: String

    @Column(nullable = false)
    var active: Boolean = false

    @Column(nullable = false)
    @OneToMany(cascade = [CascadeType.ALL])
    lateinit var phoneList: MutableList<Phone>

    @Column(nullable=false)
    @OneToMany(cascade = [CascadeType.ALL])
    lateinit var department: MutableList<Department>

}