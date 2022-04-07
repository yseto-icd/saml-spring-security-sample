package com.example.demo.context

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.saml2.provider.service.registration.InMemoryRelyingPartyRegistrationRepository
import org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository
import org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrations

@ConstructorBinding
@ConfigurationProperties("security.saml")
data class SamlProperties(val metaDataLocation: String, val registrationid: String)

@Configuration
class SamlConfig {
    @Autowired
    lateinit var config: SamlProperties
    @Bean
    fun relyingPartyRegistrationRepository(): RelyingPartyRegistrationRepository {
        val relyingPartyRegistration = RelyingPartyRegistrations
            .fromMetadataLocation(config.metaDataLocation)
            .registrationId(config.registrationid)
            .build()
        return InMemoryRelyingPartyRegistrationRepository(relyingPartyRegistration)
    }
}
