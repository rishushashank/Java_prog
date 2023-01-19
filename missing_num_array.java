package com.company;
import java.util.*;

public class missing_num_array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr [] = new int[n-1];
        for(int i =0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n-1;i++){
            if(i+1 != arr[i]){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println (n);
    }
}
