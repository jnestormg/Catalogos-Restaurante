package com.catalogos.menu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "home","index"})
public class RestauranteController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto(){
        return "contacto";
    }

    @GetMapping("/restaurant")
    public String restaurant(){
        return "restaurant";
    }

   
}
