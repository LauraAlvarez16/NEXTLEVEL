/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author LAURA
 */
import java.util.List;
import Modelo.Documentos;
public interface CRUD_Documentos {
    
    public List listar();

    public Documentos list(int id);

    public boolean add(Documentos doc);

    public boolean eliminar(int id);

    public List buscar(String texto);
}
