
package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Persona;
import com.portfolio.argprog.Interface.IPersonaService;
import java.util.List;
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
@CrossOrigin (origins ="http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping ("personas/traer")
    public List<Persona> getPersona(){
        
        return iPersonaService.getPersona();
    }
    
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        
        iPersonaService.savePersona(persona);
        
        return "Persona Creada";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        
        iPersonaService.deletePersona(id);
        
        return "Persona borrada";
    }
   
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("sobremi") String sobremi,
            @RequestParam("domicilio") String nuevoDomicilio,
            @RequestParam("telefono") String nuevoTelefono,
            @RequestParam("correo") String nuevoCorreo,
            @RequestParam("img") String nuevoImg,
            @RequestParam("edad") String nuevaEdad){
        
      Persona persona =iPersonaService.findPersona(id);
      
      persona.setNombre(nuevoNombre);
      persona.setApellido(nuevoApellido);
      persona.setSobremi(sobremi);
      persona.setDomicilio(nuevoDomicilio);
      persona.setTelefono(nuevoTelefono); 
      persona.setCorreo(nuevoCorreo);
      persona.setImg(nuevoImg);
      persona.setEdad(nuevaEdad);
      
      iPersonaService.savePersona(persona);
      return persona;
    }
    
    @GetMapping ("/personas/traer/perfil")
    public Persona findPersona(){
        
        return iPersonaService.findPersona((long)1);
    }
}
