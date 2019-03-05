package com.endava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "show_form";
    }

    @RequestMapping("/procesForm")
    public String procesForm() {
        return "proces_form";
    }
}