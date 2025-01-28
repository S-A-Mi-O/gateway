package com.samio.gateway.controller

import com.samio.core.controller.abstraction.DownstreamRestControllerTemplate
import com.samio.core.controller.annotation.ControllerFor
import com.samio.gateway.model._permission._Permission
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "_Permission API", description = "Endpoints for downstream permissions.")
@RestController
@RequestMapping("/permissions")
@Suppress("ClassName", "unused")
@ControllerFor(_Permission::class)
class _PermissionController : DownstreamRestControllerTemplate<_Permission>()