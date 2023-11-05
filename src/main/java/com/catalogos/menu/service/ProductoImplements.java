package com.catalogos.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogos.menu.models.entity.Producto;
import com.catalogos.menu.repositories.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoImplements implements IProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    @Transactional
    public List<Producto> mostrar() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void guardar(Producto producto) {
       repository.save(producto);
    }

    @Override
    @Transactional
    public Producto buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    
}
