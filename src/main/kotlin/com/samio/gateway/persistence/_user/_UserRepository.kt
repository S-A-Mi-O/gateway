package com.samio.gateway.persistence._user

import com.samio.core.application.validation.userrole.UserRole
import com.samio.core.persistence.abstraction.EntityRepository
import com.samio.gateway.model._user._User
import java.util.*


@Suppress("ClassName", "unused")
interface _UserRepository : EntityRepository<_User, UUID> {
    fun findByUsername(username: String): _User?
    fun countByUserRoleIs(userRole: UserRole): Int
}