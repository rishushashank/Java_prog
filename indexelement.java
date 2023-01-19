package com.company;
import java.util.*;

public class indexelement {
    public static int[] a(int arr[]){

        int n = arr.length;
        int ans[] = new int[n];
        for(int i =0;i<n;i++){
            int a = arr[arr[i]];
            ans[a] = arr[i] ;
        }
        return ans;

    }
    public static void main(String[] args){
        int n = 4;int arr[] = {3,2,0,1};
        int a[] = new int[4];
        a = a(arr);
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
