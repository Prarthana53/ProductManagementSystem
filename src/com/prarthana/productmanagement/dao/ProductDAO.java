/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productmanagement.dao;

import com.prarthana.productmanagement.obj.Product;
import java.util.List;

/**
 *
 * @author Pavilion G4
 */
public interface ProductDAO {
    boolean insert(Product p);
    boolean delete(int id);
    Product getById(int id);
    List<Product> getAll();
}
