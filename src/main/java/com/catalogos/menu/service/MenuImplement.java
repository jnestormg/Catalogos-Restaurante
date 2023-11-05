package com.catalogos.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogos.menu.models.entity.Menu;
import com.catalogos.menu.repositories.MenuRepository;

import jakarta.transaction.Transactional;

@Service
public class MenuImplement implements IMenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    @Transactional
    public Long contar() {
        return menuRepository.count();
    }

    @Override
    @Transactional
    public void guardarMenu(Menu menu) {
       menuRepository.save(menu);
    }

    @Override
    public List<Menu> mostrarMenu() {
       return menuRepository.findAll();
    }
    
}
