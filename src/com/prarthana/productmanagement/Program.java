/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productmanagement;

import com.prarthana.productmanagement.controller.ProductController;
import com.prarthana.productmanagement.dao.ProductDAO;
import com.prarthana.productmanagement.dao.impl.ProductDAOImpl;
import java.io.IOException;


import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ProductDAO prodDAO=new ProductDAOImpl();
        Scanner sc=new Scanner(System.in);
        ProductController pc=new ProductController(sc, prodDAO);
        pc.process();
        
        
        
        
        
        
    }
    
}
