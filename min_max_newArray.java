package com.company;
import java.util.*;

public class min_max_newArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2;i<a.length;i++){
            if(i%2 == 0){
                a[i] = a[i/2];
            }else{
                a[i] = a[i/2] + a[(i/2) + 1];
            }
        }
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Max:"+Arrays.stream(a).max().getAsInt());
    }
}
