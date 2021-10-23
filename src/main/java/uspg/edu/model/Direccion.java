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
public class Direccion implements ShownInformation {
    
    public String Pais;
    public String Departamento;
    public String Ciudad;
    public String Colonia;

    public Direccion(String Pais, String Departamento, String Ciudad, String Colonia) {
        this.Pais = Pais;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Colonia = Colonia;
      
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    @Override
    public void ShowInformation() {
        
        System.out.println ("pais:           \t" + getPais() + "\nDepartamento: \t"  + getDepartamento () + 
                            "\nCiudad:  \t" + getCiudad () + "\nColonia: \t" + getColonia () );
    }
    
    
    
    
}
