/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author janto
 */
public class conexion{
   
    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ger'sgarage?characterEncoding=latin1", "root", "Karlita+16");
           System.out.println("Connected");
          
           
        } catch (ClassNotFoundException e) {
            return null;

        } catch (SQLException e){
           return null;
        }
       return con;
    }
    
}
