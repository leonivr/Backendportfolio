package com.portfolio.argprog.Interface;

import java.util.List;

import com.portfolio.argprog.Entity.Proyecto;

public interface IProyectoService {

    public List<Proyecto> getProyecto(); //lista de proyectos
    
    public void saveProyecto(Proyecto proyecto);//guardar proyecto
    
    public void deleteProyecto(Long id); //borrar proyecto
    
   public Proyecto findProyecto(Long Id); // Buscar proyecto
}
