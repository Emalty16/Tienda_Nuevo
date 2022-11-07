
package com.Tienda_L.controller;

import com.Tienda_L.domain.Cliente;
import com.Tienda_L.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/cliente/listado")
    public String inicio(Model model){        
        var clientes = clienteService.getClientes();
        
        model.addAttribute("clientes", clientes);
        
        return "/cliente/listado";
        
        
    }
    
    @GetMapping ("/cliente/nuevo")
    public String nuevoCliente (Cliente cliente){
        return "/cliente/modifica";
        
    }
    
    @GetMapping("/cliente/guardar")
    public String guardarCliente(Cliente cliente, Model model){
        clienteService.save(cliente);
        return "redirect:/cliente/listado";
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cliente/modificar";
    }
    
    @GetMapping("/cliente/eliminar/{idCliente}")
    public String eliminarCliente(Cliente cliente, Model model){
        clienteService.delete(cliente);
        return "redirect:/cliente/listado";
    }
}
