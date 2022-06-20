package com.portfolio.argprog.Controller;

import java.util.List;

import com.portfolio.argprog.Entity.Proyecto;
import com.portfolio.argprog.Interface.IProyectoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    @Autowired IProyectoService iProyectoService;

    @GetMapping ("proyectos/traer")

    public List<Proyecto> getProyecto(){
        
        return iProyectoService.getProyecto();
    }

    @PostMapping ("/proyectos/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        
        iProyectoService.saveProyecto(proyecto);
        
        return "Proyecto Creado";
    }

    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        
        iProyectoService.deleteProyecto(id);
        
        return "Proyecto borrado";
    }
}
