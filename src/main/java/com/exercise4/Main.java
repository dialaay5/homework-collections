package com.exercise4;

import com.exercise3.MySortedSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queueyList = new MyQueue<>(new ArrayList<>(List.of(20,23,8,1)));
        queueyList.enqueue(2);
        queueyList.dequeue(); // remove the first item
        System.out.println("the array size :" + queueyList.myListSize());
        System.out.println("Before Reverse ArrayList:");
        queueyList.print();
        queueyList.reverseList();
        System.out.println("After Reverse ArrayList:");
        queueyList.print();
    }
}
