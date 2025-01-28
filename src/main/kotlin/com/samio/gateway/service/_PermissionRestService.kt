package com.samio.gateway.service

import com.samio.core.service.abstraction.DownstreamRestServiceTemplate
import com.samio.core.service.annotation.RestServiceFor
import com.samio.gateway.model._permission._Permission
import org.springframework.stereotype.Service

@Service
@Suppress("ClassName")
@RestServiceFor(_Permission::class)
class _PermissionRestService : DownstreamRestServiceTemplate<_Permission>()