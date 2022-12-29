/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mpucci
 */
public class DAOUsuario extends conexion {

    public usuario identificar(usuario user) throws Exception {
        usuario usu = null;
        conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "Select * from usuarios "
                + " Where nickname = '" + user.getNickName() + "'"
                + "And password = '" + user.getClave() + "'";
 
        con = new conexion();

        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next() == true) {
                usu = new usuario();
                
                usu.setId_usuario(rs.getInt("id"));
                usu.setNickName(user.getNombreUsuario());
                usu.setNombreUsuario(user.getNombreUsuario());

            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            if (rs != null && rs.isClosed() == false) {
                rs.close();
            }
            rs = null;

            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;

            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
        return usu;

    }

    public void insert(usuario user) throws Exception {
        conexion con;
        Connection cn = null;
        PreparedStatement ps = null;

        con = new conexion();
        cn = con.conectar();

        String sql = "INSERT INTO usuarios(nickname, nombre, mail, password, tel) VALUES (?,?,?,?,?)";
        ps = cn.prepareStatement(sql);
        ps.setString(1, user.getNickName());
        ps.setString(2, user.getNombreUsuario());
        ps.setString(3, user.getMail());
        ps.setString(4, user.getClave());
        ps.setString(5, user.getTel());

               

        ps.executeUpdate();
        

        if (cn != null && cn.isClosed() == false) {
            cn.close();
        }
        cn = null;

    }
}
