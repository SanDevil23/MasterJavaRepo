/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.SOLID;

/**
 *
 * @author Sankalp Adhya
 */

class Cook {
    public void bakePastry(){
        System.out.println("Baking tasty Pastries.....");
    }
}

class StoreManager {
    public void orderNewSupplies(){
        System.out.println("Ordering new supplies......");
    }
}

class CustomerServices  {
    public void customerFeedback() {
        System.out.println("Take feedback from customers.......");
    }
}

class Cleaner {
    public void cleanTheStore() {
        System.out.println("Cleaning the kitchen........");
    }
}

public class SingleResponsibility {
    Cook baker = new Cook();
    StoreManager manager = new StoreManager();
    Cleaner janitor = new Cleaner();
    CustomerServices waiter = new CustomerServices();
    
    
}
