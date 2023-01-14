/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;

/**
 *
 * @author janto
 */
public class CustomerDao {
    
    public static boolean newRegister(Customer e){
     try {  
    
    String SQL = "INSERT INTO `ger'sgarage`.`customer` (`c_name`, `c_surname`, `c_birth`, `c_phone`, `c_email`, `c_password`) VALUES (?, ?, ?, ?,?, ?);";
    //String SQL = "INSERT INTO `ger'sgarage`.`customer` (`c_name`, `c_surname`, `c_birth`, `c_phone`, `c_email`, `c_password`) VALUES (" + e.getC_name()  +"," + e.getC_surname() +"" , ?, ?,?, ?);";
     Connection con = conexion.conectar();
        
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, e.getC_name());
            pst.setString(2, e.getC_surname());
            pst.setString(3, e.getC_birth());
            pst.setInt(4, e.getC_phone());
            pst.setString(5, e.getC_email());
            pst.setString(6, e.getC_password());
            
            
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
     
     public static ArrayList<Customer> list() throws Exception{
         try {
            String SQL = "select *from Customer;";
            Connection con = conexion.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet result = pst.executeQuery(SQL);
            ArrayList<Customer> list = null;
            Customer cust;
            
            while(result.next()){
            cust = new Customer();
            cust.setC_id(result.getInt("c_id"));
            cust.setC_name(result.getString("c_name"));
            cust.setC_surname(result.getString("c_surname"));
            cust.setC_birth(result.getString("c_birth"));
            cust.setC_phone(result.getInt("c_phone"));
            cust.setC_email(result.getString("c_email"));
            cust.setC_password(result.getString("c_password"));
            list.add(cust);
            }
            return list;
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
     }
    
  
    
    
}
