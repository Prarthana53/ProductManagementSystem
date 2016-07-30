/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productmanagement.dao.impl;

import com.prarthana.productmanagement.dao.ProductDAO;
import com.prarthana.productmanagement.obj.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pavilion G4
 */
public class ProductDAOImpl implements ProductDAO{
    private List<Product> productList=new ArrayList<>();

    @Override
    public boolean insert(Product p) {
       return  productList.add(p);
    }

    @Override
    public boolean delete(int id) {
        Product p=getById(id);
        if(p!=null){
        return productList.remove(p);
        
        }
        return false;
    }

    @Override
    public Product getById(int id) {
       for(Product p:productList){
       if(p.getId()==id){
       return p;
       }
       
       }  
       return null;
      
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
    
}
