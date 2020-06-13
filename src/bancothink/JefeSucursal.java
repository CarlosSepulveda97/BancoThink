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
public class JefeSucursal extends Persona{

    private final int idTrabajador;
    private Solicitud soli;
    
    public JefeSucursal(String rut, String nombre, String primerApellido, String segundoApellido, String telefono,
                        String direccionParticular, String direccionLaboral, int idTrabajador, Solicitud soli) 
    {    
        super(rut, nombre, primerApellido, segundoApellido, telefono, direccionParticular, direccionLaboral);
        this.idTrabajador=idTrabajador;
        this.soli=soli;
    }
    
    public void aprobarSolicitud(){
        soli.setEstado(true);
    }
    
    public void rechazarSolicitud(){
        soli.setEstado(false);
        soli.setVigente(false);
    }
    
}
