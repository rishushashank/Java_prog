package com.company;

import java.util.LinkedList;

public class ll_collectionFramework {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(3);
        list.addLast(5);
        list.addFirst(1);
        list.add(2,4);
        System.out.println(list);

    }


}
