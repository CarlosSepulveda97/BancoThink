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
public class Ejecutivo extends Persona{
    private int idTrabajador;
    
    public Ejecutivo(String rut, String nombre, String primerApellido, String segundoApellido, String telefono, String direccionParticular, String direccionLaboral) {
        super(rut, nombre, primerApellido, segundoApellido, telefono, direccionParticular, direccionLaboral);
        this.idTrabajador=idTrabajador;
    }
    
    
    public void generarSolicitud(){
        
        
        Solicitud soli=new Solicitud();
           
    }
    
    
    public void buscarCliente(){
        
    }
    
    
    
}
