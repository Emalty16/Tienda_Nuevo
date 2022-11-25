
package com.Tienda_L.dao;

import com.Tienda_L.domain.Articulo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
    
   List<Articulo> findByExistencias (int existencias);
    
   public List<Articulo> findByExistenciasOrIdCategoria (int existencias, Long IdCategoria);
}
