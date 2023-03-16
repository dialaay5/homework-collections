package com.exercise3;

import com.exercise2.MySet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySortedSet<Integer> integer_arrayList = new MySortedSet<>(new ArrayList<>(List.of(1,10,9,7)));
        integer_arrayList.insertItem(5);
        integer_arrayList.insertItem(2);
        integer_arrayList.insertItem(1);

        System.out.println("Array List Size: " + integer_arrayList.listSize());
        integer_arrayList.printList();
    }
}
