package com.company;
import java.util.*;

public class max_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum=0,max_sum=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
    }
}
