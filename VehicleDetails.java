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
public class VehicleDetails {
    int v_id;
    int mv_id;
    int vm_id;
    int tv_id;
    String licence_details;
    String engine;

    public VehicleDetails() {
    }

    public VehicleDetails(int v_id, int mv_id, int vm_id, int tv_id, String licence_details, String engine) {
        this.v_id = v_id;
        this.mv_id = mv_id;
        this.vm_id = vm_id;
        this.tv_id = tv_id;
        this.licence_details = licence_details;
        this.engine = engine;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getMv_id() {
        return mv_id;
    }

    public void setMv_id(int mv_id) {
        this.mv_id = mv_id;
    }

    public int getVm_id() {
        return vm_id;
    }

    public void setVm_id(int vm_id) {
        this.vm_id = vm_id;
    }

    public int getTv_id() {
        return tv_id;
    }

    public void setTv_id(int tv_id) {
        this.tv_id = tv_id;
    }

    public String getLicence_details() {
        return licence_details;
    }

    public void setLicence_details(String licence_details) {
        this.licence_details = licence_details;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "VehicleDetails{" + "v_id=" + v_id + ", mv_id=" + mv_id + ", vm_id=" + vm_id + ", tv_id=" + tv_id + ", licence_details=" + licence_details + ", engine=" + engine + '}';
    }
    
    
    
    
    
}