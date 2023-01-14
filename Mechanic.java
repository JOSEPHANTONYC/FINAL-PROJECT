/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author janto
 */
public class Mechanic {
    int m_id;
    String m_name;
    String m_surname ;
    int m_phone; 
    String m_email; 
    String m_password;  

    public Mechanic() {
    }

    public Mechanic(int m_id, String m_name, String m_surname, int m_phone, String m_email, String m_password) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_surname = m_surname;
        this.m_phone = m_phone;
        this.m_email = m_email;
        this.m_password = m_password;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_surname() {
        return m_surname;
    }

    public void setM_surname(String m_surname) {
        this.m_surname = m_surname;
    }

    public int getM_phone() {
        return m_phone;
    }

    public void setM_phone(int m_phone) {
        this.m_phone = m_phone;
    }

    public String getM_email() {
        return m_email;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    @Override
    public String toString() {
        return "Mechanic{" + "m_id=" + m_id + ", m_name=" + m_name + ", m_surname=" + m_surname + ", m_phone=" + m_phone + ", m_email=" + m_email + ", m_password=" + m_password + '}';
    }
    
    
    
}
