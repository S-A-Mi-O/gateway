package com.samio.gateway.config.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class InterceptorConfig : WebMvcConfigurer {

    @Autowired
    private lateinit var activityInterceptor: ActivityInterceptor

    @Autowired
    private lateinit var rateLimitingInterceptor: HandlerInterceptor

    @Autowired
    private lateinit var superAdminInterceptor: SuperAdminCreationInterceptor

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(activityInterceptor)
            .excludePathPatterns(
                "/auth/**",
                "/favicon.ico",
                "/swagger-ui/**",
                "/v3/api-docs/**",
                "/swagger-resources/**",
                "/webjars/**"
            )

        registry.addInterceptor(rateLimitingInterceptor)
            .excludePathPatterns(
                "/auth/**",
                "/favicon.ico",
                "/swagger-ui/**",
                "/v3/api-docs/**",
                "/swagger-resources/**",
                "/webjars/**"
            )

        registry.addInterceptor(superAdminInterceptor)
            .excludePathPatterns(
                "/auth/**",
                "/favicon.ico",
                "/swagger-ui/**",
                "/v3/api-docs/**",
                "/swagger-resources/**",
                "/webjars/**"
            )
    }
}