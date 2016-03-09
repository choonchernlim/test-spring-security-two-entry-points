package com.github.choonchernlim.testSpringSecurity2EntryPoints.security;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class FormLoginAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(FormLoginAuthenticationFilter.class);

    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {

        LOGGER.info("Attempting to authentication...");

        // TODO values should come directly from request.getParameter(..)
        final String badgeId = "";
        final String lanId = "userLanId";
        final String password = "userPassword";

        final UsernamePasswordAuthenticationToken authenticationToken = StringUtils.isNotBlank(badgeId) ?
                new BadgeIdAuthenticationToken(badgeId) :
                new LanIdAndPasswordAuthenticationToken(lanId, password);

        return super.getAuthenticationManager().authenticate(authenticationToken);
    }
}
