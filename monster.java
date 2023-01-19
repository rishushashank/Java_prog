package com.company;
import java.util.*;
public class monster {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        //no. of monster
        int n =sc.nextInt();
        //your energy
        int e = sc.nextInt();
        //power of each monster
        int p[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            p[i]=sc.nextInt();
        }
        Arrays.sort(p);
        // bonus after defeat monster
        int b[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            b[i]=sc.nextInt();
        }
        for(int i = 0; i< n; i++){
            if(p[i]<=e){
                c++;
                e = e+b[i];
            }
        }
        System.out.println("number of monster defeat:"+c);
    }
}
