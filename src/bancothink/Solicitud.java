/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancothink;

import static java.lang.Integer.parseInt;

/**
 *
 * @author carlo
 */
public class Solicitud extends Emision{

    
    private String fechaSolicitud;
    private boolean estado;
    private boolean vigente=true;
    static final int MAXIMODEDIAS=10;
    
    
    
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isVigente() {
        return vigente;
    }

    //objetos cliente
    //objeto credito (instancia)
    //conexion (pk y fk) 
    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    
    
    //calcular tiempo de aprobacion 

    public String calcularFecha(){
        
        if (parseInt(super.calcularFecha(fechaSolicitud, MAXIMODEDIAS))>10){
            vigente=false;
        }
        
        return "";
    }
    
    
}
