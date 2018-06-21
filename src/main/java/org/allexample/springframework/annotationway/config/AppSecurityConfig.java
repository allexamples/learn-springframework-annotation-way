package org.allexample.springframework.annotationway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().withUser(userBuilder.username("James").password("test@123").roles("ADMIN"));
        auth.inMemoryAuthentication().withUser(userBuilder.username("Rod").password("test@123").roles("EMPLOYEE"));
        auth.inMemoryAuthentication().withUser(userBuilder.username("Martin").password("test@123").roles("LEADER"));
    }
}
