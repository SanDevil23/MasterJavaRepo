/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.patterns;

import java.util.Scanner;

/**
 *
 * @author Sankalp Adhya
 */
public class Pattern2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        printPattern2(n);
    }
    
    
    public static void printPattern2(int n ){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
