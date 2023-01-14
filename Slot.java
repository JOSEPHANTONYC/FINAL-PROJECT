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
public class Slot {
    
    int slot_id;
    int s_id;
    int v_id;
    String state;
    String comment;

    public Slot() {
    }

    public Slot(int slot_id, int s_id, int v_id, String state, String comment) {
        this.slot_id = slot_id;
        this.s_id = s_id;
        this.v_id = v_id;
        this.state = state;
        this.comment = comment;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Slot{" + "slot_id=" + slot_id + ", s_id=" + s_id + ", v_id=" + v_id + ", state=" + state + ", comment=" + comment + '}';
    }
    
    
    
}
