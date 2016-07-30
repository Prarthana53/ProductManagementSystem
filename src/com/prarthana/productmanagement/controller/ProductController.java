/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productmanagement.controller;

import com.prarthana.productmanagement.dao.ProductDAO;
import com.prarthana.productmanagement.obj.Product;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class ProductController {
    private Scanner sc;
    ProductDAO prodDAO;

  
    public ProductController(Scanner sc,ProductDAO prodDAO){
    this.prodDAO=prodDAO;
    this.sc=sc;
    
    
    }
    
       private void menu(){     
            System.out.println("Product Details");
            System.out.println("===================================");
            System.out.println("1. Add Product: ");
            System.out.println("2. Delete Product: ");
            System.out.println("3. Search Product By ID: ");
            System.out.println("4. Show All: ");
            System.out.println("5. Write to File: ");
            System.out.println("6. Exit: ");
            System.out.println("Enter your choice[1-5]: ");
       }
    private void add(){
        Product p=new Product();
        
        
        System.out.println("Enter ID: ");
        p.setId(sc.nextInt());
        System.out.println("Enter Name: ");
        p.setName(sc.next());
        System.out.println("Enter Price: ");
        p.setPrice(sc.nextDouble());
        System.out.println("Enter Quantity: ");
        p.setQuantity(sc.nextInt());
        System.out.println("Enter Status: ");
        p.setStatus(sc.nextBoolean());
        if(prodDAO.insert(p)){
            System.out.println("Inserted Successfully.");
        
        } else{
            System.out.println("Data Full.");
        }
       
        
       
    }
    
    
    private void delete(){
    
                    
                    
                        System.out.print("Enter Product Id to Delete : ");
                        if (prodDAO.delete(sc.nextInt())) {
                            System.out.println("Enquiry deleted successfully.");
                        } else {
                            System.out.println("Product does not exist.");
                        }
                        
        
}
   private void search(){
   
    
                        System.out.print("Enter Product Id to Search : ");
                        Product product = prodDAO.getById(sc.nextInt());
                        if (product != null) {
                            System.out.println("Product ID : " + product.getId());
                            System.out.println("Name: " + product.getName());
                            System.out.println("Price : " + product.getPrice());
                            System.out.println("Quantity : " + product.getQuantity());
                            System.out.println("Status : " + product.isStatus());
                        } else {
                            System.out.println("Enquiry could not be found.");
                        }
                      

   } 
    
    private void showAll(){
        
    prodDAO.getAll().forEach(p->{
        System.out.println("==========================");
        System.out.println("Product ID: "+p.getId());
        System.out.println("Name: "+p.getName());
        System.out.println("Price: "+p.getPrice());
        System.out.println("Quantity: "+p.getQuantity());
        System.out.println("Status: "+p.isStatus());
    });
    }
    
    
    private void writeToFile() throws IOException{
    try(FileWriter writer = new FileWriter("C:\\Users\\Pavilion G4\\Desktop\\output\\out.txt");
                BufferedWriter bufferedwriter =new BufferedWriter(writer)){
        
       
            prodDAO.getAll().forEach((Product p)->{
                try {
                    
                    bufferedwriter.write(p.getId()+" "+p.getName()+" "+p.getPrice()+" " +p.getQuantity()+" "+p.isStatus());
                    bufferedwriter.newLine();
                    
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            });
            System.out.println("Write Successful.");
            bufferedwriter.close();
        }
                    
                
            
            }
        
  
    
    
    
    public void process() throws IOException{
        while(true){
        menu();
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                while(true){
               add();
                  System.out.print("Do you want to add another Product?[Y/N] : ");
                        if (sc.next().equalsIgnoreCase("n")) {
                            break;
                            
                        }
                        

        
        
        }
                break;
            case 2:
                while(true){
                delete();
                System.out.println("Do you want to delete another Product? [Y/N] : ");
                        if (sc.next().equalsIgnoreCase("N")) {
                          break;
                        }
                }
                
                break;

            case 3:
while (true) {
                search();
                  System.out.println("Continue Search?[Y/N] : ");
                        if (sc.next().equalsIgnoreCase("N")) {
                          break;
                        }
                        System.out.println("");
                    }

                break;
            case 4:
              showAll();
                break;
            case 5:
                writeToFile();
                break;
            case 6:
              
                System.exit(0);
                break;

        
        }
        }
    }
}
