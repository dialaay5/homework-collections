package com.exercise1;

import lombok.Getter;

public class MyLinkedList <T>{
    @Getter
    MyNode<T> root;
    MyNode<T> reversevalue = null;
    MyNode<T> nextvalue = null;

    public MyLinkedList(MyNode<T> root) {
        this.root = root;
    }
    public int get_size() {
        int counter = 0;
        MyNode<T> current = root;
        while (current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void print_LinkedList() {
        while (this.root != null) {
            System.out.print(this.root.data + " ");
            this.root = root.next;
        }
    }
    public void print_reverse_LinkedList(){
            while (this.root != null) {
                nextvalue = this.root.next;
                this.root.next = reversevalue;
                reversevalue = this.root;
                this.root = nextvalue;
            }
            this.root = reversevalue;
        }
    }

