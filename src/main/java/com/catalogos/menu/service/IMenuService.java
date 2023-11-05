package com.catalogos.menu.service;


import java.util.List;

import com.catalogos.menu.models.entity.Menu;

public interface IMenuService {

    public Long contar();

    public void guardarMenu(Menu menu);

    public List<Menu> mostrarMenu();
    
}
