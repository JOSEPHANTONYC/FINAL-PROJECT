/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Customer;
import models.Mechanic;

/**
 *
 * @author janto
 */
public class MechanicDao {
    
      public static boolean newRegisterM(Mechanic m){
     try {  
    
    String SQL = "INSERT INTO `ger'sgarage`.`mechanic` (`m_name`, `m_surname`, `m_phone`, `m_email`, `m_password`) VALUES (?, ?, ?, ?, ?);";
    //String SQL = "INSERT INTO `ger'sgarage`.`customer` (`c_name`, `c_surname`, `c_birth`, `c_phone`, `c_email`, `c_password`) VALUES (" + e.getC_name()  +"," + e.getC_surname() +"" , ?, ?,?, ?);";
     Connection con = conexion.conectar();
        
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, m.getM_name());
            pst.setString(2, m.getM_surname());
           // pst.setString(3, e.getC_birth());
            pst.setInt(3, m.getM_phone());
            pst.setString(4, m.getM_email());
            pst.setString(5, m.getM_password());
            
            
            if (pst.executeUpdate()>0){
            return true;
            }else {
            return false;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
