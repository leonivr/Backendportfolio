package com.portfolio.argprog.Controller;

import java.util.List;

import com.portfolio.argprog.Entity.Experiencia;
import com.portfolio.argprog.Interface.IExperienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController     
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaController {
    @Autowired IExperienciaService iExperienciaService;
    
    @GetMapping ("experiencias/traer/experiencia")
    public List<Experiencia> getExperiencia(){
        
        return iExperienciaService.getExperiencia();
    }
    
    @PostMapping ("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        
        iExperienciaService.saveExperiencia(experiencia);
        
        return "Experiencia Creada";
    }
    
    @DeleteMapping ("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        
        iExperienciaService.deleteExperiencia(id);
        
        return "Experiencia borrada";
    }
   
    @PutMapping ("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
            @RequestParam("nombreEmpresa") String nuevoNombre,
            @RequestParam("fechaInicio") String nuevaFechaInicio,
            @RequestParam("fechaFin") String nuevaFechaFin,
            @RequestParam("descripcion") String nuevaDescripcion){
        
      Experiencia experiencia =iExperienciaService.findExperiencia(id);
      
      experiencia.setNombreEmpresa(nuevoNombre);
      experiencia.setFechaInicio(nuevaFechaInicio);
      experiencia.setFechaFin(nuevaFechaFin);
      experiencia.setDescripcion(nuevaDescripcion);

      iExperienciaService.saveExperiencia(experiencia);
      return experiencia;
    }
    
    @GetMapping ("/experiencias/traer/perfil")
    public Experiencia findExperiencia(){
        
        return iExperienciaService.findExperiencia((long)1);
    }
}
