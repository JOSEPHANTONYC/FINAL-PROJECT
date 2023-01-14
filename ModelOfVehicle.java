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
public class ModelOfVehicle {
    int mv_id;
    String mv_name;

    public ModelOfVehicle() {
    }

    public ModelOfVehicle(int mv_id, String mv_name) {
        this.mv_id = mv_id;
        this.mv_name = mv_name;
    }

    public int getMv_id() {
        return mv_id;
    }

    public void setMv_id(int mv_id) {
        this.mv_id = mv_id;
    }

    public String getMv_name() {
        return mv_name;
    }

    public void setMv_name(String mv_name) {
        this.mv_name = mv_name;
    }

    @Override
    public String toString() {
        return "ModelOfVehicle{" + "mv_id=" + mv_id + ", mv_name=" + mv_name + '}';
    }
    
    
    
}