/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.patterns.Pattern1;
import com.mycompany.mavenproject1.patterns.Pattern2;
import com.mycompany.mavenproject1.threads.MultiThreading;

/**
 *
 * @author Sankalp Adhya
 */
public class MavenProject1 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Pattern1.printPattern1(8);
//        Pattern2.printPattern2(8);
        
        MultiThreading obj1 = new MultiThreading();
        
        obj1.start();
    }
}
