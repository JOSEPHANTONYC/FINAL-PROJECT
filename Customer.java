/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import config.conexion;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janto
 */
public class Customer implements Serializable{
    int c_id;
    String c_name ;
    String c_surname;
    String c_birth;
    int c_phone;
    String c_email;
    String c_password;

    public Customer() {
    }

    public Customer(int c_id, String c_name, String c_surname) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_surname = c_surname;
    }
    

    
    
    public Customer(int c_id, String c_name, String c_surname, String c_birth, int c_phone, String c_email, String c_password) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_surname = c_surname;
        this.c_birth = c_birth;
        this.c_phone = c_phone;
        this.c_email = c_email;
        this.c_password = c_password;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) throws Exception {
      
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_surname() {
        return c_surname;
    }

    public void setC_surname(String c_surname) {
        this.c_surname = c_surname;
    }

    public String getC_birth() {
        return c_birth;
    }

    public void setC_birth(String c_birth) {
        this.c_birth = c_birth;
    }

    public int getC_phone() {
        return c_phone;
    }

    public void setC_phone(int c_phone) {
        this.c_phone = c_phone;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    @Override
    public String toString() {
        return "Customer{" + "c_id=" + c_id + ", c_name=" + c_name + ", c_surname=" + c_surname + ", c_birth=" + c_birth + ", c_phone=" + c_phone + ", c_email=" + c_email + ", c_password=" + c_password + '}';
    }
    
    
    public List<Customer> obtenerListado() throws SQLException, ClassNotFoundException{
        Statement stmt;
        PreparedStatement pst;
        Connection con;
        String myQuery;
        ResultSet queryResult;
        conexion db = new conexion();
        con = db.conectar();
        myQuery = "select c_id, c_name, c_surname  from  customer";
        //myQuery = "select *  from  mechanic where m_email = 'MarcoGuzman@gmail.com' and m_password = '123456781'";
        pst = con.prepareStatement(myQuery); 
        List<Customer> lista = new ArrayList<>(); 
        //queryResult = stmt.executeQuery(myQuery);
        queryResult = pst.executeQuery();
        while(queryResult.next()){
           int id = queryResult.getInt("c_id");
           String name = queryResult.getString("c_name");
           String surname = queryResult.getString("c_surname");
           Customer c = new Customer(id,name,surname);
           lista.add(c);

        }
        return lista;
    }
    
    public String getName(int id) throws SQLException, ClassNotFoundException{
        Statement stmt;
        PreparedStatement pst;
        Connection con;
        String myQuery;
        ResultSet queryResult;
        conexion db = new conexion();
        con = db.conectar();
        myQuery = "select c_name from  customer where c_id ='"+id+"'";
        String name = "";
        //myQuery = "select *  from  mechanic where m_email = 'MarcoGuzman@gmail.com' and m_password = '123456781'";
        pst = con.prepareStatement(myQuery); 
        queryResult = pst.executeQuery();
        if(queryResult.next()){
           name = queryResult.getString("c_name");
        }
        return name;
    }
}
