package com.samio.gateway.service

import com.samio.core.service.abstraction.EventServiceTemplate
import com.samio.core.service.annotation.EventServiceFor
import com.samio.gateway.model._user._User
import org.springframework.stereotype.Service


@Suppress("ClassName")
@Service
@EventServiceFor(_User::class)
class _UserEventService : EventServiceTemplate<_User>()