package io.url.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // No session will be created or used by spring security
            .and()
            .httpBasic()
            .and()
            .authorizeRequests()
//            .antMatchers("/api/**").permitAll()
            .antMatchers("/static/**").permitAll()
            .anyRequest().permitAll()
            .and()
            .cors()
            .and()
            .csrf()
            .disable()
    }
}