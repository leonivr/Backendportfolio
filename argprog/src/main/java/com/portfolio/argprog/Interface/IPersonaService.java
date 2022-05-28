
package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona(); //lista de personas
    
    public void savePersona(Persona persona);//guardar persona
    
    public void deletePersona(Long id); //borrar persona
    
   public Persona findPersona(Long Id); // Buscar persona
}
