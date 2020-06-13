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
public class FactoriaFormularios {
    
    public static String TipoFormulario;
    
    public static Formulario getFormulario(String tipo) {
 
    if (tipo.equals(TipoFormulario)) {
        return new FormularioCompleto();
    }
    else {
        return new FormularioMinimo();
    }
    }
}
