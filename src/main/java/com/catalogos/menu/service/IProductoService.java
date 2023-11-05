package com.catalogos.menu.service;

import java.util.List;

import com.catalogos.menu.models.entity.Producto;

public interface IProductoService  {

    //mostrar productos
    public List<Producto> mostrar();

    //guardar producto
    public void guardar(Producto producto);

    //buscar
    public Producto buscar(Long id);

    //eliminar
    public void eliminar(Long id);

    
    
}
