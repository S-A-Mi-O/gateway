package com.samio.gateway.persistence._permission

import com.samio.core.persistence.abstraction.EntityPersistenceAdapter
import com.samio.core.persistence.annotation.PersistenceAdapterFor
import com.samio.gateway.model._permission._Permission
import org.springframework.stereotype.Service

@Service
@PersistenceAdapterFor(_Permission::class)
@Suppress("ClassName")
class _PermissionPersistenceAdapter : EntityPersistenceAdapter<_Permission>()