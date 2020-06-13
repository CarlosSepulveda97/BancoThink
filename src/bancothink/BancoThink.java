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
public class BancoThink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.getConexion("localhost", "root", "", "DataBase");//SINGLETON
        
    }
    
}


/*

    El patron singleton esta aplicado ala clase Conexion, que trata de un objeto con la informacion necesaria para conectarse a un SQL Server

    El patron fabrica esta implementado  a la peticion de formularios para el cliente ya que existen dos tipos de este y el cliente es quien desidira cual completar


*/