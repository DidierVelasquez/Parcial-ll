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
public class NumeroTelefonico implements ShownInformation{
    
    public Integer Numeropersonal;
    public Integer NumeroResidencia;
    

    public NumeroTelefonico(Integer Numeropersonal, Integer NumeroResidencia) {
        
        this.Numeropersonal = Numeropersonal;
        this.NumeroResidencia = NumeroResidencia;
    }

    public Integer getNumeropersonal() {
        return Numeropersonal;
    }

    public void setNumeropersonal(Integer Numeropersonal) {
        this.Numeropersonal = Numeropersonal;
    }

    public Integer getNumeroResidencia() {
        return NumeroResidencia;
    }

    public void setNumeroResidencia(Integer NumeroResidencia) {
        this.NumeroResidencia = NumeroResidencia;
    }

    @Override
    public void ShowInformation() {
        
        System.out.println ("Telefono personal: \t" + getNumeropersonal () + "\nTelefono Residencial: \t"  + getNumeroResidencia ());
    }

    
    

}
