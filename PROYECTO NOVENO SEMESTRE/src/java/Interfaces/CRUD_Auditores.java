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
import Modelo.Auditor;
public interface CRUD_Auditores {
    public List listar();

    public Auditor list(int id);

    public boolean add(Auditor usu);

    public boolean edit(Auditor usu);

    public boolean eliminar(int id);

    public List buscar(String texto);
    
    }
