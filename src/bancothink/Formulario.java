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
public abstract class Formulario {
    private int idFormulario;
    public Formulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }
    
    public abstract void mostrarForm();
    
}
