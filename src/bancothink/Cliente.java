/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancothink;

/**
 *
 * @author carlo
 */
public class Cliente extends Persona{
    
    //RUT, Primer Nombre, Primer y Segundo Apellido, teléfono, dirección particular, dirección laboral. 
    
    private String antiguedad;
    private double sueldo;

    public Cliente(String rut, String nombre, String primerApellido, String segundoApellido, String telefono, String direccionParticular, String direccionLaboral,
                    String antiguedad, double sueldo) {
        super(rut, nombre, primerApellido, segundoApellido, telefono, direccionParticular, direccionLaboral);
        this.antiguedad=antiguedad;
        this.sueldo=sueldo;   
        
    }

    public void solicitarCredito(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
