package com.company;
import java.util.*;
import java.awt.Point;
public class distinct_pair {
    public static int count(int arr[] ,int n){
        int c =0;
        HashSet<Point> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                set.add(new Point(arr[i],arr[j]));
            }
        }
        c = set.size();
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = count(arr,n);
        System.out.println(ans);
    }
}
