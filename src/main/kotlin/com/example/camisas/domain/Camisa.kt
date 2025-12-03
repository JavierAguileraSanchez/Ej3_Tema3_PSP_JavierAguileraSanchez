package com.example.camisas.domain

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "camisas")
class Camisa(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 120)
    var nombre: String,

    var talla: String? = null,
    var color: String? = null,

    var precio: BigDecimal? = null,

    @Column(name = "imagen_url")
    var imagenUrl: String? = null,

    var lat: Double? = null,
    var lng: Double? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_id")
    var tipo: TipoCamisa
)
