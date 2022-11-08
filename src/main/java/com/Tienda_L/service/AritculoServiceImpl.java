/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda_L.service;

import com.Tienda_L.dao.ArticuloDao;
import com.Tienda_L.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author usuario
 */
public class AritculoServiceImpl implements ArticuloService {
@Autowired
ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) {
        var lista = (List<Articulo>)articuloDao.findAll();
    
        if (activos) {
            lista.removeIf (e -> !e.isActivo());
        
        
        }
        
         return lista; // 4 = 2 y 2 A
    }

    @Override
    public Articulo getArticulo(Articulo categoria) {
        return articuloDao.findById(categoria.getIdArticulo()).orElse(null);
    }

    @Override
    public void save(Articulo categoria) {
        articuloDao.save(categoria);
    }

    @Override
    public void delete(Articulo categoria) {
        articuloDao.delete(categoria);
    }
    

    @Override
    public List<Articulo> getPorExistencias(int existencias) {
        return articuloDao.findByExistencias(existencias);
    }

    @Override
    public List<Articulo> findByExistenciasOrIdCategoria(int existencias, Long idCategoria) {
        return articuloDao.findByExistenciasOrIdCategoria(existencias, idCategoria);
    }
}
