package com.samio.gateway.service

import com.samio.core.service.abstraction.DownstreamRestServiceTemplate
import com.samio.core.service.annotation.RestServiceFor
import com.samio.gateway.model._user._User
import com.samio.gateway.persistence._user._UserPersistenceAdapter
import org.springframework.stereotype.Service


@Service
@RestServiceFor(_User::class)
@Suppress("ClassName")
class _UserRestService(
    private val adapter: _UserPersistenceAdapter
) : DownstreamRestServiceTemplate<_User>() {
    //Todo: Replace by pre-implemented method
    fun getByUsername(username: String): _User? {
        return adapter.getByUsername(username)
    }
    fun getSuperAdminCount(): Int {
        return adapter.getSuperAdminCount()
    }
}