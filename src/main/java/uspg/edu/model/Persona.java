/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.model;

/**
 *
 * @author casa vb
 */
public class Persona implements ShownInformation {
    
    public Integer ID; 
    public String Nombre; 
    public String Apellido;
   

    public Persona(Integer ID, String Nombre, String Apellido) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
       
        
    
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
     @Override
    public void ShowInformation() {
        
        System.out.println("Datos: ");
       
        System.out.println ("ID:           \t" + getID () + "\nNombre: \t"  + getNombre () + 
                            "\nApellido:  \t" + getApellido () );

    }

   
    }
    
    
 

