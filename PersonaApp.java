/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;


public class PersonaApp {

    
    public static void main(String[] args) {
        
        PersonaServicio servicio = new PersonaServicio();
        
       Persona[] listaPersonas = servicio.crearPersonasPrueba();
        
       servicio.porcentajesPeso(listaPersonas);
       
       servicio.porcentajeEdad(listaPersonas);
       
       
       
        
                            
        
        
    }
    
    
}
