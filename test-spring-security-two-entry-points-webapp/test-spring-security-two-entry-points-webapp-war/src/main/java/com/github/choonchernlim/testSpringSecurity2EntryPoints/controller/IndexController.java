package com.github.choonchernlim.testSpringSecurity2EntryPoints.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public final class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/goodbye", method = RequestMethod.GET)
    public String goodbye() {
        return "goodbye";
    }
}
