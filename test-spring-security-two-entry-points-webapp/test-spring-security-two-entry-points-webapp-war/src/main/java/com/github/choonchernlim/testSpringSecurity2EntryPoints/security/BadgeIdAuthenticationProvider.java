package com.github.choonchernlim.testSpringSecurity2EntryPoints.security;

import com.google.common.collect.ImmutableSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public final class BadgeIdAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(BadgeIdAuthenticationProvider.class);

    @Override
    protected UserDetails retrieveUser(String username,
                                       UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

        LOGGER.info("Authenticating badge ID...");

        // TODO do your authentication here...

        return new User(username, "", ImmutableSet.of(new SimpleGrantedAuthority("ROLE_USER")));
    }

    @Override
    public boolean supports(Class<? extends Object> authentication) {
        return BadgeIdAuthenticationToken.class.isAssignableFrom(authentication);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
    }
}
