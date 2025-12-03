package com.example.camisas.web.dto

data class TipoCamisaResponse(
    val id: Long,
    val nombre: String,
    val descripcion: String? = null,
    val version: String = "default" // Campo de prueba
)
