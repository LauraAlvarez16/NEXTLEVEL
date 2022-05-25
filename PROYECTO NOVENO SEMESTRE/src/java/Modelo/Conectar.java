/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LAURA
 */
public class Conectar {
    Connection con;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    public Connection getConnection(){

          try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3","root","");
            System.out.print("Conexion establecida");
            //JOptionPane.showMessageDialog(null,"Conexion establecida");
        } catch (Exception e) {
            System.out.println("ERROR EN LA CONEXION"+e.getMessage());
        }
        return con;
    }
    
   
}
