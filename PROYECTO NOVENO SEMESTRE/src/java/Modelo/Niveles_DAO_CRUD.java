/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LAURA
 *
 *
 */
public class Niveles_DAO_CRUD extends Conectar{

    public Auditor identificar(Auditor user) throws Exception {
        Auditor usu = null;
        Conectar con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        Encriptar enc = new Encriptar();
        String sql = "SELECT id_auditor, nivel FROM auditor LEFT JOIN niveles ON auditor.id_niveles = niveles.id_niveles WHERE nick = '" + user.getNick() + "' AND contraseña = '" + enc.getMD5(user.getContraseña()) + "';";
        
        con = new Conectar();
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            if (rs.next() == true) {

                usu = new Auditor();
                usu.setId_auditor(rs.getInt("id_auditor"));
                System.out.println("ID DAO"+ rs.getInt("id_auditor") );
                usu.setNick(user.getNick());
                usu.setNivel(new Niveles());
                usu.getNivel().setNiveles(rs.getString("nivel"));
                System.out.println("Nivel DAO"+ rs.getString("nivel"));
            }
        } catch (Exception e) {
            System.out.println("ERROR DAO " + e.getMessage());
        }finally{
            if (rs !=null && rs.isClosed() == false){
                rs.close();
            }
            rs = null;
            if(st!= null && st.isClosed() == false){
                st.close();
                
            }
            st = null;
            if(cn != null & cn.isClosed() == false){
                cn.close();
                
            }
            cn = null;
        }
        return usu;
    }
}
