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
import Modelo.Usuario;


public interface CRUD_Usuarios {

    public List listar();

    public Usuario list(int id);

    public boolean add(Usuario usu);

    public boolean edit(Usuario usu);

    public boolean eliminar(int id);

    public List buscar(String texto);
    
    
}
