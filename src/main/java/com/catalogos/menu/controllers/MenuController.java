package com.catalogos.menu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.catalogos.menu.models.entity.Menu;
import com.catalogos.menu.models.entity.Producto;
import com.catalogos.menu.service.IMenuService;

@Controller
public class MenuController {

    @Autowired
    private IMenuService menuService;
    
   /*  @GetMapping("/index")
    public String crear(Model model){
        Menu menu= new Menu();
       
        model.addAttribute("producto", menu);
        return "index";
    }

    @PostMapping("/index")
    public String guardar(Menu menu){
        menuService.guardar(menu);
        return "index";
    }*/

    @GetMapping("/index")
    public String crearMenu(Model model){
        Menu menu= new Menu();
        Long cont=menuService.contar();
       
        model.addAttribute("contador", cont);
       
        model.addAttribute("menu", menu);
        return "index";
    }
    @PostMapping("/index")
    public String guardarMenu(Menu menu){
        menuService.guardarMenu(menu);
        return "redirect:/menu";
    }

    @GetMapping("/menu")
        public String mostrarMenu(Model modelo){
            Menu menu = new Menu();
            modelo.addAttribute("menus", menuService.mostrarMenu());
            return "menu";
        }
    
}
