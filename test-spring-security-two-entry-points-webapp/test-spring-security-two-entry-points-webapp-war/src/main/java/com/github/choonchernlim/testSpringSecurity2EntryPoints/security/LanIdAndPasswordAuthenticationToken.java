package com.github.choonchernlim.testSpringSecurity2EntryPoints.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public final class LanIdAndPasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
    public LanIdAndPasswordAuthenticationToken(Object principal, Object credential) {
        super(principal, credential);
    }

}
