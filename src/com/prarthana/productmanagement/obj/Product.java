/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productmanagement.obj;



/**
 *
 * @author Pavilion G4
 */
public class Product {
   private int id,quantity;
   private String name;
   private double price;
   private boolean status;

    public Product() {
    }

    public Product(int id, int quantity, String name, double price, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
   
   
}
