package com.catalogos.menu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogos.menu.models.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    
    
}
