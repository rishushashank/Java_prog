package com.company;
import java.util.*;

public class binarytree {

    public static int leafnode(btnode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.leftchild ==null && root.rightchild == null){
            return 1;
        }
        return leafnode(root.leftchild)+leafnode(root.rightchild);
    }

    public static int height(btnode<Integer> root){
        if (root == null){
            return 0;
        }
        int h =1;
        h+=Math.max(height(root.leftchild),height(root.rightchild));
        return h;

    }

    public static int largest(btnode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftlarge = largest(root.leftchild);
        int rightlarge = largest(root.rightchild);
        return Math.max(root.data,Math.max(leftlarge,rightlarge));
    }

    public static void postorder(btnode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        postorder(root.leftchild);
        postorder(root.rightchild);
    }

    public static void preorder(btnode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }

    public static void print(btnode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+":");
        if(root.leftchild != null)
        System.out.print(root.leftchild.data+"l,");
        if(root.rightchild != null)
        System.out.print(root.rightchild.data+"r");
        System.out.println();
        print(root.leftchild);
        print(root.rightchild);
        
    }

    public static btnode<Integer> takeinput(Scanner sc){
        System.out.println("print root data");
        int rootdata = sc.nextInt();
        if(rootdata == -1){
            return null; 
        }
        btnode<Integer> root = new btnode<>(rootdata);
        btnode<Integer> lchild = takeinput(sc);
        btnode<Integer> rchild = takeinput(sc);
        root.leftchild = lchild;
        root.rightchild = rchild;
        return root;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        btnode<Integer> root = takeinput(sc);
        print(root);
        // preorder(root);
        // postorder(root);
        // System.out.println(largest(root));
        // System.out.println(height(root));
        System.out.println(leafnode(root));

    }
}
