package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class subArray_withgiven_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int i=0,j=0,sum = 0;
        while(j<n){
            sum += a[i];
            if(sum == s){
                System.out.println(++i);
                System.out.println(++j);
                break;
            }
            i+=1;
            if(sum>s || i >= n){
                sum =0;
                j+=1;
                i =j;
            }
            if(j >= n){
                System.out.println(-1);
                break;
            }
        }
    }
}