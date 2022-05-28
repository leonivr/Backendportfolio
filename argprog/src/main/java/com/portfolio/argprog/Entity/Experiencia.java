package com.portfolio.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreEmpresa() {
        return nombre_empresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombre_empresa = nombreEmpresa;
    }
    public String getFechaInicio() {
        return fecha_inicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fecha_inicio = fechaInicio;
    }
    public String getFechaFin() {
        return fecha_fin;
    }
    public void setFechaFin(String fechaFin) {
        this.fecha_fin = fechaFin;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
