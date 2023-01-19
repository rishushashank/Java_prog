package com.company;

import java.util.Scanner;

public class mountain {
    static void numberChange(int a[],int mid ,int n){
        int c=0;
        if(mid %2 != 0 ){
            int j=mid;
            int num = a[mid];
            //boolean found = false;
            for(int i=mid-1;i>=0;i--) {
                if(a[i] != num ){
                    c++;
                }
                if(a[j] != num ){
                    c++;
                }
                j++;
                num--;

            }

            
        }
        else{
            int j=mid+1;
            int num = a[mid]-1;
            //boolean found = false;
            for(int i=mid-1;i>=0;i--) {
                if(a[i] != num ){
                    c++;
                }
                if(a[j] != num ){
                    c++;
                }
                j++;
                num--;

            }
        }
        System.out.println(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]= sc.nextInt();
        }
            int mid = n/2;
            numberChange(a,mid,n);


    }
}
