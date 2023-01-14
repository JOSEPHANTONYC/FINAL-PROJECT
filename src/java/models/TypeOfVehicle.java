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
public class TypeOfVehicle {
    
    int tv_id;
    String tv_name;

    public TypeOfVehicle() {
    }

    public TypeOfVehicle(int tv_id, String tv_name) {
        this.tv_id = tv_id;
        this.tv_name = tv_name;
    }

    public int getTv_id() {
        return tv_id;
    }

    public void setTv_id(int tv_id) {
        this.tv_id = tv_id;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    @Override
    public String toString() {
        return "TypeOfVehicle{" + "tv_id=" + tv_id + ", tv_name=" + tv_name + '}';
    }
    
    
    
}

