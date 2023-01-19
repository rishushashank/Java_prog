package com.company;
import java.util.*;

public class Tree {

    public static void postorder(NewNodeTree<Integer> root){
        for(int i = 0;i<root.child.size();i++){
            postorder(root.child.get(i));
        }
        System.out.println(root.data);
    }

    public static void preorder(NewNodeTree<Integer> root){
        System.out.println(root.data);
        for(int i = 0;i<root.child.size();i++){
            preorder(root.child.get(i));
        }
    }

    public static int countleaf(NewNodeTree<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.child.size() == 0){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<root.child.size();i++){
            ans += countleaf(root.child.get(i));
        }
        return ans;
    }

    public static void printatk(NewNodeTree<Integer> root,int k){
        if(k<0){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        for(int i =0;i<root.child.size();i++){
        printatk(root.child.get(i),k-1);
        }
    }

    // public static int height(NewNodeTree<Integer> root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int max= Integer.MIN_VALUE;
    //     for(int i =0;i<root.child.size()-1;i++){
    //         int h = height(root.child.get(i));
    //         if(max <h ){
    //             max = h;
    //         }
    //     }
    //     return max;
    // }

    public static int largest(NewNodeTree<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for(int i =0;i<root.child.size();i++){
            int l = largest(root.child.get(i));
            if(ans < l){
                ans = l;
            }
        }
        return ans;
    }

    public static int countnode(NewNodeTree<Integer> root){
        //edge case
        if(root == null){
            return 0;
        }
        int c= 1;
        for(int i=0;i<root.child.size();i++){
            c+=countnode(root.child.get(i));
        }
        return c;
    }

    public static NewNodeTree<Integer> tekrinputlevel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int data = sc.nextInt();
        NewNodeTree<Integer> root = new NewNodeTree<Integer>(data);
        Queue<NewNodeTree<Integer>> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            NewNodeTree<Integer> frontNode = que.poll();
            System.out.println("enter the number of children");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int c = sc.nextInt();
                NewNodeTree<Integer> chil = new NewNodeTree<Integer>(c);
                frontNode.child.add(chil);
                que.offer(chil);
            }
        }
        return root;
    }

    public static NewNodeTree<Integer> takeinput(Scanner sc){
    System.out.println("enter the value of node");
    int data = sc.nextInt();
    NewNodeTree<Integer> root = new NewNodeTree<Integer>(data);
    System.out.println("enter no of Children of this node");
    int n = sc.nextInt();
    for(int i =0;i<n;i++){
        NewNodeTree<Integer> children = takeinput(sc);
        root.child.add(children);
    }
        return root;
    }

    public static void print(NewNodeTree<Integer> root){
        String s = root.data + ":";
        for(int i =0;i<root.child.size();i++){
            s+=root.child.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.child.size();i++){
            print(root.child.get(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NewNodeTree<Integer> root = takeinput(sc);
        print(root);
        //System.out.println(height(root));
        System.out.println("Number of leaf node "+countleaf(root));
    }
    
}
