package com.portfolio.argprog.Service;

import java.util.List;

import com.portfolio.argprog.Entity.Experiencia;
import com.portfolio.argprog.Interface.IExperienciaService;
import com.portfolio.argprog.Repository.IExperienciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{

    @Autowired IExperienciaRepository iExperienciaRepository;
    public List<Experiencia> getExperiencia() {
        
      return iExperienciaRepository.findAll();
    }
    
    public void saveExperiencia(Experiencia experiencia) {
        
        iExperienciaRepository.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        
        iExperienciaRepository.deleteById(id);
    }

    public Experiencia findExperiencia(Long Id) {
        
        return iExperienciaRepository.findById(Id).orElse(null);
    }
    
}
