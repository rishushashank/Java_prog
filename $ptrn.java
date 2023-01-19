package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
class $ptrn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        for(int i =1;i<=n;i++){
            if(i %2 != 0){
                for(int j = 1;j<=i;j++){
                    x++;
                    if(j<i)
                    System.out.print(x+"$");
                    else
                    System.out.print(x);
                }
            }else{
                x+=i;
                for(int j = 1;j<=i;j++){
                    if(j<i)
                    System.out.print(x+"$");
                    else
                    System.out.print(x);
                    x--;
                }
                x+=i;
            }
            System.out.println();
        }
    }
}