/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.threads;

/**
 *
 * @author Sankalp Adhya
 */

class MultiThread extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().threadId()+" is running");
		}catch (Exception e) {
			System.out.println("Error");
		}
	}
}
public class Concurrency{
	
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = 0; i<n; i++) {
			MultiThread demo = new MultiThread();
			demo.start();
		}
	}
	
}