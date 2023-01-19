package com.company;
import java.util.*;
public class TreeNode<T>{
    public T data;
    ArrayList<TreeNode<T>> children;
    TreeNode( T data){
        this.data = data;
        children = new ArrayList<>();
    }

}