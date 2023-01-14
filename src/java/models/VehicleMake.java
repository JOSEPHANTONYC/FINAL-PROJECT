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
public class VehicleMake {
    int vm_id;
    String vm_name;

    public VehicleMake() {
    }

    public VehicleMake(int vm_id, String vm_name) {
        this.vm_id = vm_id;
        this.vm_name = vm_name;
    }

    public int getVm_id() {
        return vm_id;
    }

    public void setVm_id(int vm_id) {
        this.vm_id = vm_id;
    }

    public String getVm_name() {
        return vm_name;
    }

    public void setVm_name(String vm_name) {
        this.vm_name = vm_name;
    }

    @Override
    public String toString() {
        return "VehicleMake{" + "vm_id=" + vm_id + ", vm_name=" + vm_name + '}';
    }
    
    
    
    
}

