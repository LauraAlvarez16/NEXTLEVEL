/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.CRUD_Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author LAURA
 */
public class Usuario_DAO_CRUD implements CRUD_Usuarios {

    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario usu = new Usuario();

    @Override

    public List listar() {

        ArrayList<Usuario> list = new ArrayList<>();
        String sql = "SELECT id_usuario, nombre_usuario, apellido_usuario, cif_niif, correo_usuario, telefono_usuario, nombre_area, cargo_usuario\n"
                + "FROM usuario LEFT JOIN area ON usuario.id_area = area.id_area";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setNombre(rs.getString("nombre_usuario"));
                usu.setApellido(rs.getString("apellido_usuario"));
                usu.setCif_niif(rs.getString("cif_niif"));
                usu.setCorreo(rs.getString("correo_usuario"));
                usu.setTelefono(rs.getString("telefono_usuario"));
                usu.setArea(rs.getString("nombre_area"));
                usu.setCargo(rs.getString("cargo_usuario"));
                list.add(usu);

            }
        } catch (Exception e) {
        }
        return list;

    }

    @Override
    public Usuario list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Usuario usu) {
        String sql = "INSERT INTO usuario(nombre_usuario,apellido_usuario,cif_niif,correo_usuario,telefono_usuario,id_area,cargo_usuario) VALUES(?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("no se pudo");
        }
        return false;
    }

    @Override
    public boolean edit(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List buscar(String texto) {
        List<Usuario> lista = new ArrayList<>();
        String sql;
        sql = "SELECT * FROM usuario where nombre_usuario like '%" + texto + "%' or nombre_area like '%" + texto + "%' or cargo_usuario like '%" + texto + "%'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();

                usu.setNombre(rs.getString("nombre_usuario"));
                usu.setArea(rs.getString("nombre_area"));
                usu.setCargo(rs.getString("cargo_usuario"));

                lista.add(usu);
            }
        } catch (Exception e) {
        }
        return lista;
    }

 
   

}
