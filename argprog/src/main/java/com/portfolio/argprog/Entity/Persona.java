
package com.portfolio.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50, message= "longitud no válida")
    private String nombre;  
    @Size(min = 1, max = 50, message= "longitud no válida")
    private String apellido; 
    private String sobremi;
    private String fechaNac;
    private String domicilio;
    private String edad;
    private String telefono;
    private String correo;
    @Size(min = 1, max = 50, message= "longitud no válida")
    private String img;

    public Long getId() {
        return id;
    }
    
    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSobremi(){
        
        return this.sobremi;
    }
    
    public void setSobremi(String sobremi){
        
        this.sobremi=sobremi;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    public String getEdad(){
        return edad;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getImg() {
        return img;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setImg(String img) {
        this.img = img;
    }   
    
    public String getCorreo(){
        
        return this.correo;
    }
    public void setCorreo(String correo){
        
        this.correo=correo;
    }
}
