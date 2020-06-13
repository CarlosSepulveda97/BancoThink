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
public class Conexion {
    
    
    private String host="";
    private String user="";
    private String pass="";
    private String database="";
    
    private static Conexion conector;
    
    
    public  static Conexion getConexion(String host,String user, String pass, String database) {
 
        if (conector==null) {
            conector=new Conexion(host,user,pass,database);
        }
            return conector;
        }
  
    //Constructor privado
    private Conexion(String host,String user,String pass,String database) {
        this.host=host;
        this.user=user;
        this.pass=pass;
        this.pass=database;
    }
    
    
    
     
    
    
    //setters
    
    public void setHost(String host) {
        this.host = host;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    
}
