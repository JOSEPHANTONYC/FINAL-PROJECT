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
public class SpareParts {
    
  int sp_id;
  String item;
  int price;
  int stock;

    public SpareParts() {
    }

    public SpareParts(int sp_id, String item, int price, int stock) {
        this.sp_id = sp_id;
        this.item = item;
        this.price = price;
        this.stock = stock;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "SpareParts{" + "sp_id=" + sp_id + ", item=" + item + ", price=" + price + ", stock=" + stock + '}';
    }
  
  
  
    
}
