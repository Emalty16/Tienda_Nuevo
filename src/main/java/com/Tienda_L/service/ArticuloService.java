
package com.Tienda_L.service;

import com.Tienda_L.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activos);
    
    public Articulo getArticulo (Articulo articulo);
    
    public void save (Articulo articulo);
    
    public void delete (Articulo articulo);
    
   public List<Articulo> getPorExistencias(int existencias);
   
   public List<Articulo> findByExistenciasOrIdCategoria (int existencias, Long IdCategoria);
}
