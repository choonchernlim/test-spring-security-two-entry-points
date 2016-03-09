package com.github.choonchernlim.testSpringSecurity2EntryPoints.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public final class BadgeIdAuthenticationToken extends UsernamePasswordAuthenticationToken {
    public BadgeIdAuthenticationToken(Object principal) {
        super(principal, null);
    }

}
