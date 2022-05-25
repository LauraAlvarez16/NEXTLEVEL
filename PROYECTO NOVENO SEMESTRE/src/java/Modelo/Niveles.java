/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LAURA
 */
public class Niveles {
     int id_nivel;
     String niveles;

    

    public Niveles(int id_nivel, String niveles) {
        this.id_nivel = id_nivel;
        this.niveles = niveles;
    }

   public Niveles() {
        
   }

    
    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getNiveles() {
        return niveles;
    }

    public void setNiveles(String niveles) {
        this.niveles = niveles;
    }

    
    
}