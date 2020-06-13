/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancothink;

import static bancothink.Solicitud.MAXIMODEDIAS;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Contrato extends Emision {
    
    private String fechaContrato;
    private ArrayList<String> fechasDePago;
    private boolean aprobado;
    
     public String calcularFecha(){
        
        fechasDePago.add(fechaContrato);
        calcularFecha(fechasDePago);
        
        return "";
    }
   
}
