package com.company;
import java.util.*;
public class rateat {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int unit = s.nextInt();
        int n = s.nextInt();
        if(n == 0){
            System.out.println(-1);
            return;
        }
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int sum = 0;
        int i=0;
        while(sum<(r*unit)){
            sum += arr[i];
            i++;
        }
        if(sum < (r*unit)){
            System.out.println(0);
            return;
        }
        System.out.println(i+1);

    }
}
