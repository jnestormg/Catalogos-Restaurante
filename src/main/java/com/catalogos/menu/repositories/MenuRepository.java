package com.catalogos.menu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogos.menu.models.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    
}
