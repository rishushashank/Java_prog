package com.company;
import java.util.*;

public class sumbinary {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            int A = Integer.parseInt(a,2);
            int B = Integer.parseInt(b,2);
            System.out.println(A+" "+B);
            int sum = A+B;
            System.out.println(sum);
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
        System.out.println(Integer.toBinaryString(max));
    }
}
