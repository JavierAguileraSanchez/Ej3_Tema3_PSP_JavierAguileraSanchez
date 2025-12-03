package com.example.camisas.repository

import com.example.camisas.domain.Camisa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CamisaRepository : JpaRepository<Camisa, Long>
