package com.company;

import java.util.Scanner;

public class half_diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println('*');
        for(int i =1;i<=n;i++) {
            System.out.println('*');
            int j = 1;
            //first half
           while(j<=i) {
                    System.out.print(j);
                    j++;
                }
           j-=2;
           while(j>0){
            System.out.println(j);
            j--;
            }

        //second half
//        for(int i =n-1;i>=0;i--) {
//            System.out.print('*');
//            //first half
//            for (int j = 1; j <=i  + 1; j++) {
//                System.out.print(j % 5);
//            }
//            System.out.println('*');
       }
            //System.out.println();
        }
}
