package com.portfolio.argprog.Service;

import java.util.List;

import com.portfolio.argprog.Entity.Proyecto;
import com.portfolio.argprog.Interface.IProyectoService;
import com.portfolio.argprog.Repository.IProyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService{

    @Autowired IProyectoRepository iProyectoRepository;
    public List<Proyecto> getProyecto() {
        
        return iProyectoRepository.findAll();
    }

   
    public void saveProyecto(Proyecto proyecto) {
      
        iProyectoRepository.save(proyecto);
    }

   
    public void deleteProyecto(Long id) {

        iProyectoRepository.deleteById(id); 
    }

   
    public Proyecto findProyecto(Long Id) {
       
        return iProyectoRepository.findById(Id).orElse(null);
    }
    
}
