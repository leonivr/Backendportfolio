package com.portfolio.argprog.Interface;

import java.util.List;

import com.portfolio.argprog.Entity.Experiencia;

public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia(); //lista de experiencias
    
    public void saveExperiencia(Experiencia experiencia);//guardar experiencia
    
    public void deleteExperiencia(Long id); //borrar experiencia
    
   public Experiencia findExperiencia(Long Id); // Buscar experiencia
}
