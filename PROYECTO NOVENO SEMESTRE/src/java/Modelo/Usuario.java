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
public class Usuario {
    int id_usuario, id_area;
    String nombre, apellido,cif_niif, correo;
    String telefono, cargo, area;

    public Usuario(int id_usuario, int id_area, String nombre, String apellido, String cif_niif, String correo, String telefono, String cargo, String area) {
        this.id_usuario = id_usuario;
        this.id_area = id_area;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cif_niif = cif_niif;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.area = area;
    }

    
    public Usuario() {
        
    }

    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCif_niif() {
        return cif_niif;
    }

    public void setCif_niif(String cif_niif) {
        this.cif_niif = cif_niif;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}

