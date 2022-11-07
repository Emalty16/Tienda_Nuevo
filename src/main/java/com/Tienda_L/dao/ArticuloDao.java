
package com.Tienda_L.dao;

import com.Tienda_L.domain.Articulo;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
