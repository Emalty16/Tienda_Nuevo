
package com.Tienda_L.dao;

import com.Tienda_L.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
