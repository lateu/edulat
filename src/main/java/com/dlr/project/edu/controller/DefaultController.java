package com.dlr.project.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value="/")
    public String home1() {
        return "/welcome";
    }

    @GetMapping("/welcome")
    public String homeRedirect() {
        return "/welcome";
    }

   /* @GetMapping("/eleves")
    public String eleves() {
        return "/eleves";
    }*/

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
