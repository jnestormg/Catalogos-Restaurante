package com.catalogos.menu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriaController {

    @RequestMapping("/agrega_categoria")
    public String categoria(){
        return "agrega_categoria";
    }
    
}
