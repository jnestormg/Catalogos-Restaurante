package com.catalogos.menu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.catalogos.menu.models.entity.Menu;
import com.catalogos.menu.models.entity.Producto;
import com.catalogos.menu.service.IMenuService;
import com.catalogos.menu.service.IProductoService;

@Controller

public class ProductoController {

    @Autowired
    private IProductoService service;

    @Autowired
    private IMenuService menuService;

   

    @GetMapping("/contenido")
    public String crear(Model model){
        Producto producto= new Producto();
       
        model.addAttribute("producto", producto);
        return "contenido";
    }

    @PostMapping("/contenido")
    public String guardar(Producto producto){
        service.guardar(producto);
        return "index";
    }

   

    
}
