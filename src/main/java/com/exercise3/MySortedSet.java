package com.exercise3;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class MySortedSet<Integer> implements MySortedSetable<Integer> {
    @Getter
    @Setter
    protected ArrayList<Integer> items;

    public MySortedSet(ArrayList<Integer> items) {
        this.items = items;
    }

    public void insertItem(Integer item) {
        SortedSet<Integer> sortSet = new TreeSet<>(items);
        if(sortSet.add(item)){
            this.items.add(item);
        }
        int index = 0;
        for(Integer i : sortSet){
            items.set(index,i);
            index++;
        }
    }



    @Override
    public void removeItem(Integer item) {
        this.items.remove(item);
    }

    @Override
    public int listSize() {
        return this.items.size();
    }
    public void printList(){
        for (Integer data : items) {
            System.out.println(data);
        }
    }

}
