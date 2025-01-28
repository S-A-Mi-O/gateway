package com.samio.gateway.kafka

import com.samio.core.application.kafka.EntityEvent
import com.samio.core.application.kafka.handling.abstraction.IUpdateHandler
import com.samio.gateway.model._user._User
import com.samio.gateway.service._UserEventService
import org.springframework.stereotype.Service

@Suppress("ClassName")
@Service
class _UserUpdateHandler(
    private val _userEventService: _UserEventService
) : IUpdateHandler<_User> {
    override fun applyChanges(event: EntityEvent) {
        _userEventService.updateByEvent(event)
    }
}