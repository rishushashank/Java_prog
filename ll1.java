package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class ll1 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int pos = 4;
        System.out.println(list);
        for(int i=0;i<list.size();i++){

        }
        list.remove(list.size() - pos);
        System.out.println(list);

    }
}
