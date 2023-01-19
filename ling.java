package com.company;
import java.util.*;

public class ling {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int temp =1,count =1;
        for(int i =0;i<n-1;i++){
            temp =1;
            for(int j = i+1;j<n;j++){
                if(a[j] > a[i]){
                    temp++;
                }
        }
        }
        System.out.println(count);
    }
}
