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
public class Auditor {
    int id_auditor;
    String nom_auditor,ape_auditor,cedula, correo, telefono, cargo, sector, nick, contraseña;
    Niveles nivel;

    public Auditor(int id_auditor, String nom_auditor, String ape_auditor, String cedula, String correo, String telefono, String cargo, String sector, String nick, String contraseña, Niveles nivel) {
        this.id_auditor = id_auditor;
        this.nom_auditor = nom_auditor;
        this.ape_auditor = ape_auditor;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.sector = sector;
        this.nick = nick;
        this.contraseña = contraseña;
        this.nivel = nivel;
    }

    

    public Auditor() {
        
    }

    public int getId_auditor() {
        return id_auditor;
    }

    public void setId_auditor(int id_auditor) {
        this.id_auditor = id_auditor;
    }

    public String getNom_auditor() {
        return nom_auditor;
    }

    public void setNom_auditor(String nom_auditor) {
        this.nom_auditor = nom_auditor;
    }

    public String getApe_auditor() {
        return ape_auditor;
    }

    public void setApe_auditor(String ape_auditor) {
        this.ape_auditor = ape_auditor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Niveles getNivel() {
        return nivel;
    }

    public void setNivel(Niveles nivel) {
        this.nivel = nivel;
    }

    
}