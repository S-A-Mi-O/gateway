package com.samio.gateway.kafka

import com.samio.core.application.kafka.EntityEvent
import com.samio.core.application.kafka.handling.abstraction.ICreateHandler
import com.samio.gateway.model._user._User
import com.samio.gateway.service._UserEventService
import org.springframework.stereotype.Service

@Suppress("ClassName", "unused")
@Service
class _UserCreateHandler(
    private val _userEventService: _UserEventService
) : ICreateHandler<_User> {
    override fun applyChanges(event: EntityEvent) {
        _userEventService.createByEvent(event)
    }
}