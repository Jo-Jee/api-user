package com.example.user.api.entity

import com.example.user.api.dto.UserResponseDto
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(unique = true, nullable = false)
    val email: String,
    val encodedPassword: String
): Timestamped() {
    fun toDto(): UserResponseDto {
        return UserResponseDto(
            id = id,
            email = email,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
}
