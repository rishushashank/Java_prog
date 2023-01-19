package com.company;
import java.util.*;
public class unique_birthday_gift {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int c = 0;
        //max possible value
        double n = sc.nextDouble();

        //length of an array
        double k = sc.nextDouble();

        if(k == 1){
            System.out.println(n);
            return;
        }
        
        //possible arrays using max possible value and length of array is n^k
        int PossibleArray = (int)Math.pow(n,k);

        for(int i = 1 ; i <= PossibleArray ;i++){
            int a[] = new int[(int)k];
            a[0]=i;
            int l = 1;
            for(int j = 1; j<k;j++){
                a[j]=l;
                if(a[j]%a[j-1] == 0){
                    if(j == k-1){
                        c++;
                    }
                }
                l++;
            }

        }
        System.out.println((int)c);
   }
}
