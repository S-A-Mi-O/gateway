package com.samio.gateway.model._permission

import com.samio.core.model.abstraction.BaseEntity
import jakarta.persistence.Entity

@Entity
@Suppress("ClassName")
open class _Permission(
    open var serviceOfOrigin: String = "",
    open var label: String = "",
    open var description: String = ""
) : BaseEntity()