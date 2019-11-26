package com.javainuse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {

    private static final String appName = "Sistema de Controle Academico";

    @GetMapping("/")
    public String showIndex(Model model, @RequestParam(value = "name", required = false, defaultValue = "Daniel Brasil") String name){
        model.addAttribute("name", name);
        model.addAttribute("title", appName);
        return "home";
    }
}