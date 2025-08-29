package com.mycompany.mavenproject1.system_design;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter(5,2);
        for (int i = 0; i<=10; i++){
            if (limiter.allowRequest()) {
                System.out.println("Request " + i + " allowed");
            } else {
                System.out.println("Request " + i + " denied");
            }
            Thread.sleep(300);
        }
    }
}
