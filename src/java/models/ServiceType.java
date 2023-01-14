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
public class ServiceType {
    int t_id;
    String t_name;
    int t_price;

    public ServiceType() {
    }

    public ServiceType(int t_id, String t_name, int t_price) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_price = t_price;
    }

    @Override
    public String toString() {
        return "ServiceType{" + "t_id=" + t_id + ", t_name=" + t_name + ", t_price=" + t_price + '}';
    }
    
    
    
}
