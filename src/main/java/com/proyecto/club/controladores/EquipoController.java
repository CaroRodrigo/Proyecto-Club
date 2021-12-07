package com.proyecto.club.controladores;

import com.proyecto.club.servicios.CuerpoTecnicoServicio;
import com.proyecto.club.servicios.JugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/equipo")
public class EquipoController {
    
    @Autowired
    public JugadorServicio jugadorServicio;
    
    @Autowired
    public CuerpoTecnicoServicio cuerpoTecnicoservicio;
    
    @GetMapping("")
    public String mostrarEquipo(Model model,@RequestParam(required = false) String id) {
        
            model.addAttribute("jugadores", jugadorServicio.listall());
        
            model.addAttribute("cuerpoTecnico", cuerpoTecnicoservicio.listAll());
        
        return "equipo";
}
}
