package com.mycompany.mavenproject1.dataStructures;

class BTree {
    int data;
    BTree left;
    BTree right;

    BTree(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    BTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class BinaryTree {
    BTree head = new BTree(1);


}
