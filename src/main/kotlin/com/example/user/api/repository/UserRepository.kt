package com.example.user.api.repository

import com.example.user.api.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long?> {
    fun findByEmail(email: String): User?
}