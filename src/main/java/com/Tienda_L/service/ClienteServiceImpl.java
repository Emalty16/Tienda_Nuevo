
package com.Tienda_L.service;

import com.Tienda_L.dao.ClienteDao;
import com.Tienda_L.dao.CreditoDao;
import com.Tienda_L.domain.Articulo;
import com.Tienda_L.domain.Cliente;
import com.Tienda_L.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    @Autowired
    private CreditoDao creditoDao;
    
    
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        var clientes = (List<Cliente>) clienteDao.findAll();
        
        return clientes;
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
}
