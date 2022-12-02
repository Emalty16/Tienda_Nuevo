
package com.Tienda_L.controller;


import com.Tienda_L.domain.Cliente;
import com.Tienda_L.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    
    
    @Autowired
    private ClienteService clienteService;
    
    @RequestMapping("/")
    public String inicio(Model model){        
        log.info("Ahora se usa arquitectura MVC");
        
        var clientes = clienteService.getClientes();  
        
        //var articulos = articuloService.findByExistenciasIDCategoria(5,new Long(4));
        
        model.addAttribute("articulos",clientes);      
        return "index";
        
        
    }
    
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente){
        return "modificarCliente";
    }
    @GetMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/";
    }
    
    
}
