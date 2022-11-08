
package com.Tienda_L.controller;


import com.Tienda_L.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    
    
    @Autowired
    private ArticuloService articuloService;
    
    @RequestMapping("/")
    public String inicio(Model model){        
        log.info("Ahora se usa arquitectura MVC");
        
        var articulos = articuloService.getArticulos(true);  
        
        //var articulos = articuloService.findByExistenciasIDCategoria(5,new Long(4));
        
        model.addAttribute("articulos",articulos);      
        return "index";
    }
    
}
