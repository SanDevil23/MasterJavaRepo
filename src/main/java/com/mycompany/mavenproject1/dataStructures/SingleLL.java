package com.mycompany.mavenproject1.dataStructures;

import java.util.Scanner;

// defining the structure of Node of a LL
class Node {
    int data;
    Node next;

    Node(){
        data = 0;
        next = null;
    }

    Node(int data){
        this.data = data;
        next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}


public class SingleLL {

    private static Node createLinkedList(int n){
        Scanner scan = new Scanner(System.in);
        Node head = new Node();
        Node returnNode = head;
        for (int i = 0; i<n; i++){
            if (i==n-1){
                System.out.print("Value of Node " + i+1+" = ");
                head.data = scan.nextInt();
                continue;
            }
            System.out.print("Value of Node " + (i+1)+" = ");
            head.data = scan.nextInt();
            head.next = new Node();
            head = head.next;
        }

        return returnNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of nodes in the Linked list: ");
        int n = scanner.nextInt();
        Node head = createLinkedList(n);

        while (head!=null){
            System.out.print(head.data);
            System.out.print("->");
            head = head.next;
        }
        System.out.print("Null");
        return;
    }
}
