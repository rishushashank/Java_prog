package com.company;
import java.util.*;
public class trainglearray {


    public static int f1(int a[][],int i,int r,int dp[][]){
        int ans = 0;
        if(r == a.length || i == a[r].length){
            return 0;
        }
        int ans1,ans2;
        if(dp[r+1][i] == Integer.MAX_VALUE){
            ans1 = f1( a,i, r+1,dp);
            dp[r+1][i] = ans1;
        }else{
            ans1 = dp[r+1][i] ;
        }

        if(dp[r+1][i+1] == Integer.MAX_VALUE){
            ans2 = f1( a,i+1, r+1,dp);
            dp[r+1][i+1] = ans2;
        }else{
            ans2 = dp[r+1][i] ;
        }
        return a[r][i] + Math.min(ans1,ans2);
    }


    public static int f(int a[][],int i,int r){
        int ans = 0;
        if(r == a.length){
            return 0;
        }

        int ans1 = f( a,i, r+1);
        int ans2 = f( a, i+1, r+1);
        return a[r][i] + Math.min(ans1,ans2);
    }
    public static void main(String[] args){
        //Scanner sc = new Scanner (System.in);
       // int t [][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
       int t [] [] = {{-1},{2,3},{1,-1,-1}};
        int dp[][] = new int[t.length+1][t.length+1];
        for(int i= 0;i<dp.length;i++){
            for(int j =0;j<dp.length;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.println(f(t,0,0));
        System.out.println(f1(t,0,0,dp));
    }
}
