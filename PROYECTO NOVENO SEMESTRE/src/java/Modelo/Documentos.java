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
public class Documentos {

    int id_doc, id_area, id_auditoria;
    String nom_doc, detalle, tipo_doc, categoria, version, fecha, area, titulo;
    byte[] ruta_doc;

    public Documentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Documentos(int id_doc, int id_area, int id_auditoria, String nom_doc, String detalle, String tipo_doc, String categoria, String version, String fecha, String area, String titulo, byte[] ruta_doc) {
        this.id_doc = id_doc;
        this.id_area = id_area;
        this.id_auditoria = id_auditoria;
        this.nom_doc = nom_doc;
        this.detalle = detalle;
        this.tipo_doc = tipo_doc;
        this.categoria = categoria;
        this.version = version;
        this.fecha = fecha;
        this.area = area;
        this.titulo = titulo;
        this.ruta_doc = ruta_doc;
    }

    

    public int getId_doc() {
        return id_doc;
    }

    public void setId_doc(int id_doc) {
        this.id_doc = id_doc;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_auditoria() {
        return id_auditoria;
    }

    public void setId_auditoria(int id_auditoria) {
        this.id_auditoria = id_auditoria;
    }

    public String getNom_doc() {
        return nom_doc;
    }

    public void setNom_doc(String nom_doc) {
        this.nom_doc = nom_doc;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public byte[] getRuta_doc() {
        return ruta_doc;
    }

    public void setRuta_doc(byte[] ruta_doc) {
        this.ruta_doc = ruta_doc;
    }

}
