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
public class Pattern1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arity: ");
        int n = sc.nextInt();
        printPattern1(n);
    }
    
    
    public static void printPattern1(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
