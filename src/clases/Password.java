/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author hp 14
 */
public class Password {
    private int longitud;
    private String contraseña;
    
   public Password (){
       this.longitud=8;
   }

    public Password(int longitud, String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
    public String Seguridad(){
        String aux;
        if (this.getLongitud()>=6){
            aux="Su Contraseña Es Fuerte";
        }else{
            aux="Su Contraseña Es Debil";
        }
        return aux;
}
    public Password Mostrar(){
        Password Pass;
        String aux;
        aux=this.getContraseña();
        Pass= new Password(this.getLongitud(),aux);
        return Pass;        
    }
   
}
