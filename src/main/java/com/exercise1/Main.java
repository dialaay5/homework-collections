package com.exercise1;

public class Main {
    public static void main(String[] args) {

        MyNode<Integer> root = new MyNode<>(1);
        MyLinkedList<Integer> linked_List = new MyLinkedList<>(root);

        for (int i = 2; i <= 6; i++) {
            root.next = new MyNode<>(i);
            root = root.next;
        }

        System.out.println("count of roots:" + linked_List.get_size());
        linked_List.print_reverse_LinkedList();
        linked_List.print_LinkedList();





    }
}
