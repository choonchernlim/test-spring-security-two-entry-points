package com.github.choonchernlim.testSpringSecurity2EntryPoints.config;

import com.github.choonchernlim.testSpringSecurity2EntryPoints.security.BadgeIdAuthenticationProvider;
import com.github.choonchernlim.testSpringSecurity2EntryPoints.security.FormLoginAuthenticationFilter;
import com.github.choonchernlim.testSpringSecurity2EntryPoints.security.LanIdAndPasswordAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(final WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/goodbye");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .addFilterBefore(formLoginAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .formLogin()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth
                .authenticationProvider(new BadgeIdAuthenticationProvider())
                .authenticationProvider(new LanIdAndPasswordAuthenticationProvider());
    }

    @Bean(name = "authenticationManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public FormLoginAuthenticationFilter formLoginAuthenticationFilter() throws Exception {
        FormLoginAuthenticationFilter authFilter = new FormLoginAuthenticationFilter();
        authFilter.setAuthenticationManager(authenticationManager);
        return authFilter;
    }
}
