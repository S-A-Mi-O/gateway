package com.samio.gateway.persistence._permission

import com.samio.core.persistence.abstraction.EntityRepository
import com.samio.gateway.model._permission._Permission
import java.util.*

@Suppress("unused", "ClassName")
interface _PermissionRepository : EntityRepository<_Permission, UUID>