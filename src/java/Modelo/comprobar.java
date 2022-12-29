/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.SQLException;

/**
 *
 * @author mpucci
 */
public class comprobar {
    public static void main(String[] args) throws SQLException {
        conexion con = new conexion();
        if(con.conectar()!=null){
            System.out.println("Conexion correcta");
        }else{
            System.out.println("Conexion Incorrecta");
        }
    }
}
