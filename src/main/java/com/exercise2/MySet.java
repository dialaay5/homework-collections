package com.exercise2;

import lombok.Getter;

import java.util.*;

public class MySet<T> implements MySetable<T> {
    @Getter
    protected ArrayList<T> items ;

    public MySet(ArrayList<T> items) {
        this.items = items;
    }

    public void insertItem(T item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
        }
    }

    @Override
    public void removeItem(T item) {
        this.items.remove(item);
    }
    @Override
    public int listSize(){
        return this.items.size();
    }

    public void printList(){
        for (T data : items) {
            System.out.println(data);
        }
    }



}
