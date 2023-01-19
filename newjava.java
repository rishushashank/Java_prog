package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class newjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int e = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
           a[i]= sc.nextInt();
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(a[i]);
        // }
        int totale =0;
        for(int i : a){
                totale+=i*2;
        }
        //System.out.println(totale);
        if(totale< e){
            System.out.println(-1);
        }
        else{
            Arrays.sort(a);
            for(int i=n-1;i>-1;i--){
                if(e<=0){
                    break;
                }
                    if (a[i] <=e){
                        if(2*a[i]<=e){
                            c+=2;
                        }
                        else
                        c++;
                        e-=a[i];
                    }
                    // if(a[i]<=e){
                    //     c++;
                    //     e-=a[i];
                    //     if(a[i]<=e){
                    //         c++;
                    //         e-=a[i];
                    //     }
                    // }
            }
            System.out.println(c);
        }
        
}
    }
