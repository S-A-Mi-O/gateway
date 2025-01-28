package com.samio.gateway.service

import com.samio.core.service.abstraction.EventServiceTemplate
import com.samio.core.service.annotation.EventServiceFor
import com.samio.gateway.model._permission._Permission
import org.springframework.stereotype.Service

@Suppress("ClassName")
@Service
@EventServiceFor(_Permission::class)
class _PermissionEventService : EventServiceTemplate<_Permission>()