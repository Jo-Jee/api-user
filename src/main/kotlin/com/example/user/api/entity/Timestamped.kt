package com.example.user.api.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class Timestamped {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createdAt: LocalDateTime? = null

    @LastModifiedDate
    @Column(nullable = false, updatable = false)
    var updatedAt: LocalDateTime? = null
}
