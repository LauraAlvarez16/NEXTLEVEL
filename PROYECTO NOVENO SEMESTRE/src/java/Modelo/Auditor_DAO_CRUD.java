/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.CRUD_Auditores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAURA
 */
public class Auditor_DAO_CRUD implements CRUD_Auditores {

    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Auditor usu = new Auditor();

    @Override

    public List listar() {

        ArrayList<Auditor> list = new ArrayList<>();
        String sql = "SELECT id_auditor, nombre_auditor, apellido_auditor, correo_auditor, cargo_auditor, sector_auditor, nivel, nick \n"
                + "FROM auditor LEFT JOIN niveles ON auditor.id_niveles = niveles.id_niveles;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Auditor usu = new Auditor();
                usu.setId_auditor(rs.getInt("id_auditor"));
                usu.setNom_auditor(rs.getString("nombre_auditor"));
                usu.setApe_auditor(rs.getString("apellido_auditor"));
                
                usu.setCorreo(rs.getString("correo_auditor"));
               
                usu.setCargo(rs.getString("cargo_auditor"));
                usu.setSector(rs.getString("sector_auditor"));
                usu.getNivel().setNiveles(rs.getString("nivel"));
                usu.setNick(rs.getString("nick"));
               

                list.add(usu);

            }
        } catch (Exception e) {
        }
        return list;

    }

    @Override
    public Auditor list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Auditor usu) {
        String sql = "INSERT INTO auditor(nombre_auditor, apellido_auditor, cedula_auditor, correo_auditor, telefono_auditor,cargo_auditor, sector_auditor, nick, contraseña, niveles) VALUES(?,?,?,?,?,?,?,?,?,?)";
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
    public boolean edit(Auditor usu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List buscar(String texto) {
        List<Auditor> lista = new ArrayList<>();
        String sql;
        sql = "SELECT * FROM auditor where nombre_auditor like '%" + texto + "%' or apellido_auditor like '%" + texto + "%'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Auditor usu = new Auditor();

                usu.setNom_auditor(rs.getString("nombre_auditor"));
                usu.setApe_auditor(rs.getString("apellido_auditor"));
                

                lista.add(usu);
            }
        } catch (Exception e) {
        }
        return lista;
    }

}
