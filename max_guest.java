package com.company;
import java.util.*;

public class max_guest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bache =0;
        int t = sc.nextInt();
        int aye[] = new int[t];
        int gye[] = new int[t];
        for(int i =0;i<t;i++){
            aye[i] = sc.nextInt();
        }
        for(int i =0;i<t;i++){
            gye[i] = sc.nextInt();
        }
        int max = 0;
        for(int i =0;i<t;i++){
            bache +=aye[i]-gye[i];
            if(bache>max){
                max= bache;
            }
        }

        System.out.println("Max guest: " +max);

    }
}
