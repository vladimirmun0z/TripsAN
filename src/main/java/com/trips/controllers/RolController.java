package com.trips.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.trips.services.IRolService;

@Controller
public class RolController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/tablarol")
    public String mostrarTabla(Model model) {
        model.addAttribute("listaRoles", rolService.buscarTodos());
        return "tablarol"; 
    }
}