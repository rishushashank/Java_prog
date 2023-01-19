package com.company;
import java.util.*;

public class reverse_subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            arr.add(sc.nextInt());
        }

        for(int i =0;i<n;i+=k){
        int l =i;

        int r = Math.min(n-1,i+k-1);
        while(l<r){
            Collections.swap(arr, l, r);
            l++;
            r--;
        }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr.get(i));
        }
        
    }
}
