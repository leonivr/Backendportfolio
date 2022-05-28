
package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Persona;
import com.portfolio.argprog.Interface.IPersonaService;
import com.portfolio.argprog.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{

    @Autowired IPersonaRepository iPersonaRepository;
    @Override
    public List<Persona> getPersona() {
        
        return iPersonaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long Id) {
        
        return iPersonaRepository.findById(Id).orElse(null);
    }
    
}