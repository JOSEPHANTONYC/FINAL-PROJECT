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
public class Service {
    int s_id;
    int m_id;
    int c_id;
    int t_id;
    String date; // it should be type date.

    public Service() {
    }

    public Service(int s_id, int m_id, int c_id, int t_id, String date) {
        this.s_id = s_id;
        this.m_id = m_id;
        this.c_id = c_id;
        this.t_id = t_id;
        this.date = date;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Service{" + "s_id=" + s_id + ", m_id=" + m_id + ", c_id=" + c_id + ", t_id=" + t_id + ", date=" + date + '}';
    }
    
    
    
}
