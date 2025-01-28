package com.samio.gateway.persistence._user

import com.samio.core.application.validation.userrole.UserRole
import com.samio.core.persistence.abstraction.EntityPersistenceAdapter
import com.samio.core.persistence.annotation.PersistenceAdapterFor
import com.samio.gateway.model._user._User
import org.springframework.stereotype.Service

@Service
@PersistenceAdapterFor(_User::class)
@Suppress("ClassName")
class _UserPersistenceAdapter(
    private val repository: _UserRepository
) : EntityPersistenceAdapter<_User>() {
    fun getByUsername(username: String): _User? {
        return repository.findByUsername(username)
    }

    fun getSuperAdminCount(): Int {
        return repository.countByUserRoleIs(UserRole.SUPER_ADMIN)
    }
}