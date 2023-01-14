/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import config.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author janto
 */

public class LoginModel { //this class is for allow to the customer, mechanic, and administrator if they are registered.

    Statement stmt;
    PreparedStatement pst;

    Connection con;
    String myQuery;
    ResultSet queryResult;

    public boolean conectar(String user, String password) throws SQLException, Exception { //this method will allow to log-in to the mechanic

        conexion db = new conexion();
        con = db.conectar();

        myQuery = "select *  from  mechanic where m_email = \'" + user + "\' and m_password = \'" + password + "\' ";
        pst = con.prepareStatement(myQuery);
        queryResult = pst.executeQuery();

        if (queryResult.next()) {

            return true;
        } else {

            return false;
        }
    }

    public boolean conectarC(String user, String password) throws SQLException, Exception { // this method will allow to log-in to the customers
        conexion db = new conexion();
        con = db.conectar();

        myQuery = "select *  from  customer where c_email = \'" + user + "\' and c_password = \'" + password + "\'";
        pst = con.prepareStatement(myQuery);
        queryResult = pst.executeQuery();

        if (queryResult.next()) {

            return true;
        } else {

            return false;
        }
    }

    public boolean conectarA(String user, String password) throws SQLException, Exception {// this method will allow log-in to the administrator , in this case will be 
                                                                                           // the person who has id = 1 in the table mechanic.
        conexion db = new conexion();
        con = db.conectar();

        myQuery = "select *  from  mechanic where m_email = \'" + user + "\' and m_password = \'" + password + "\' and m_id = 1;";
        pst = con.prepareStatement(myQuery);
        queryResult = pst.executeQuery();

        if (queryResult.next()) {

            return true;
        } else {

            return false;
        }
    }

}

