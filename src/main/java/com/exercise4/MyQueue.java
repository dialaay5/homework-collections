package com.exercise4;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class MyQueue <T>{
    @Getter
    protected ArrayList<T> items;

    public MyQueue(ArrayList<T> items) {
        this.items = items;
    }

    public void enqueue(T item){
        this.items.add(item);
        }
        public void dequeue(){
        this.items.remove(items.get(0));
     }
    public int myListSize() {
        return this.items.size();
    }

    public void reverseList(){
        Collections.reverse(this.items);
    }
    public void print(){
        for (T data : items) {
            System.out.println(data);
        }
    }

}
