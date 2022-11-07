/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_L.dao;

import com.Tienda_L.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
