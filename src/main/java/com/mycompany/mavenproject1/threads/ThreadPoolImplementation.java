package com.mycompany.mavenproject1.threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {	
	
	private String taskName;
	
	
	public Task(String taskName) {
		this.taskName = taskName;
	}
	
	public void run() {
		try {
			for (int i = 0; i<5; i++) {
				if (i==0) {
					Date d = new Date();
					SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
					
					System.out.println("Initialization Time for task name - "+ taskName +" = " +time.format(d));
				}else {
					Date d = new Date();
					SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
					
					System.out.println("Executing Time for task name - "+ taskName +" = " +time.format(d));					
				}
				Thread.sleep(1000);
			}
			
			System.out.println(taskName + "Completed");
		}catch(InterruptedException e) {
			e.printStackTrace(); 
		}
	}
}

public class ThreadPoolImplementation {
	static final int MAX_Threads = 3;
	public static void main(String[] args) {
		
		Runnable r1 = new Task("t1");
		Runnable r2 = new Task("t2");
		Runnable r3 = new Task("t3");
		Runnable r4 = new Task("t4");
		Runnable r5 = new Task("t5");
		
		// creates a thread pool with MAX_T no. of  
		// threads as the fixed pool size(Step 2) 

		ExecutorService pool = Executors.newFixedThreadPool(MAX_Threads);
		
		// pass the task objects to the pool
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		// pool shutdown
		
		pool.shutdown();
		
	}
	
}
