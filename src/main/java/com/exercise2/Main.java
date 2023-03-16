package com.exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MySet<Integer> arrayList = new MySet<>(new ArrayList<>(List.of(1,10,9,7)));
        arrayList.insertItem(2);
        arrayList.insertItem(1);
        System.out.println("Array List Size: " + arrayList.listSize());
        arrayList.printList();






    }
}
