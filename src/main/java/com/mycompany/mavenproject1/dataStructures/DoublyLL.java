package com.mycompany.mavenproject1.dataStructures;

// creating the nodes for the doubly linked list

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


class DoublyLinkedList{
    private DNode head;
    private DNode tail;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public DNode setHead(DNode head){
        this.head = head;
        return head;
    }

    public DNode setTail(DNode tail){
        this.tail = tail;
        return tail;
    }
}


public class DoublyLL {

    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DNode head = new DNode(4);
        head = DLL.setHead(head);

        System.out.print(head.data);

        return;
    }
}
