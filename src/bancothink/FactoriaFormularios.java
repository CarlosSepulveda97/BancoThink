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
    
    //Factoria, instancia dependiendo el dato, el formulario correspondiente
    
    private static int idFormulario;
    
    public static Formulario getFormulario(String tipo) {
 
    if (tipo.equals(tipo)) {
        return new FormularioCompleto(idFormulario);
    }
    else {
        return new FormularioMinimo(idFormulario);
    }
    }
}
