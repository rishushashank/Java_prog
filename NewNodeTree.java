package com.company;
import java.util.*;

public class NewNodeTree<T> {
    T data;
    ArrayList<NewNodeTree<T>> child;
    NewNodeTree(T data){
        this.data = data;
        child = new ArrayList<>();
    }
}
