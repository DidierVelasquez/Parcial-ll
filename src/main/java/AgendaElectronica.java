
import uspg.edu.model.Direccion;
import uspg.edu.model.NumeroTelefonico;
import uspg.edu.model.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casa vb
 */
public class AgendaElectronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Datos personales:");
        
        Persona persona = new Persona (001, "carlos", "Hernandez");
        persona.ShowInformation();
        NumeroTelefonico telefono = new NumeroTelefonico (50712416, 30514250);
        telefono.ShowInformation();
        Direccion direccion = new Direccion ("Guatemala", "Guatemala", "Metropolitana", "El esfuerzo");
        direccion.ShowInformation();
        
        System.out.println("##############################################################################");
        
        Persona persona1 = new Persona (002, "Keyli", "Gomez");
        persona.ShowInformation();
        NumeroTelefonico telefono1 = new NumeroTelefonico (30251898, 42521512);
        telefono.ShowInformation();
        Direccion direccion1 = new Direccion ("Guatemala", "Guastatoya", "Las flores", "El rancho");
        direccion.ShowInformation();
        
        System.out.println("##############################################################################");
        
        Persona persona2 = new Persona (003, "Didier", "Velasquez");
        persona.ShowInformation();
        NumeroTelefonico telefono2 = new NumeroTelefonico (69897548, 52154870);
        telefono.ShowInformation();
        Direccion direccion2 = new Direccion ("Guatemala", "Guatemala", "Metropolitana", "las minervas");
        direccion.ShowInformation();
    }
    
 
}
