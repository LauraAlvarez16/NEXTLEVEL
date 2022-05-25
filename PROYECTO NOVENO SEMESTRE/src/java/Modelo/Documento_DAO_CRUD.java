/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.CRUD_Documentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Documento_DAO_CRUD implements CRUD_Documentos {

    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Documentos doc = new Documentos();

    @Override

    public List listar() {

        ArrayList<Documentos> list = new ArrayList<>();
        String sql = "SELECT id_doc, nombre_doc, detalle, tipo_doc, categoria, version, fecha, ruta_doc, area.nombre_area, ejecucion_auditoria.titulo\n"
                + "FROM documentos \n"
                + "	LEFT JOIN area ON documentos.id_area = area.id_area \n"
                + "	LEFT JOIN ejecucion_auditoria ON documentos.id_auditoria = ejecucion_auditoria.id_auditoria";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Documentos doc = new Documentos();
                doc.setId_doc(rs.getInt("id_doc"));
                doc.setNom_doc(rs.getString("nombre_doc"));
                doc.setDetalle(rs.getString("detalle"));
                doc.setTipo_doc(rs.getString("tipo_doc"));
                doc.setCategoria(rs.getString("categoria"));
                doc.setVersion(rs.getString("version"));
                doc.setFecha(rs.getString("fecha"));
                doc.setRuta_doc(rs.getBytes("ruta_doc"));
                doc.setArea(rs.getString("nombre_area"));
                doc.setTitulo(rs.getString("titulo"));
                list.add(doc);

            }
        } catch (Exception e) {
        }
        return list;

    }

    @Override
    public Documentos list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Documentos doc) {
        String sql = "INSERT INTO documentos(nombre_doc,detalle,tipo_doc,categoria,version,fecha,ruta_doc,id_area,id_auditoria) VALUES(?,?,?,?,?,?,?,?,?)";
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
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List buscar(String texto) {
        List<Documentos> lista = new ArrayList<>();
        String sql;
        sql = "SELECT * FROM documentos where id_doc like '%" + texto + "%' or nombre_doc like '%" + texto + "%' or tipo_doc like '%" + texto + "%'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Documentos doc= new Documentos();

                doc.setId_doc(rs.getInt("id_doc"));
                doc.setNom_doc(rs.getString("nombre_doc"));
                doc.setTipo_doc(rs.getString("tipo_doc"));

                lista.add(doc);
            }
        } catch (Exception e) {
        }
        return lista;
    }

}
