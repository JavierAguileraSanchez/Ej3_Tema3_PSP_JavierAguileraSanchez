package com.example.camisas.domain

import jakarta.persistence.*

@Entity
@Table(name = "tipos_camisa")
class TipoCamisa(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, unique = true, length = 100)
    var nombre: String,

    var descripcion: String? = null
)
