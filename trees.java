package com.company;
import java.util.*;

public class trees {

    public static TreeNode<Integer> takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("number of child of this node");
        int childcount = sc.nextInt();
        for(int i=0;i<childcount;i++){
            TreeNode<Integer> temp = takeinput();
            root.children.add(temp);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i =0;i<root.children.size() ;i++){
            s+=root.children.get(i).data+ ",";
        }
        System.out.println(s);
        for(int i =0;i<root.children.size() ;i++){
            print(root.children.get(i));
        }
    }
    public static void main(String[] args){
        TreeNode<Integer> root = takeinput();
        print(root);
    }
}
