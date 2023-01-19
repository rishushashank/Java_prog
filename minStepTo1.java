package com.company;

import java.util.Scanner;

public class minStepTo1 {

    public static int f1(int n,int dp[]){
        if(n== 1){
            return 0;
        }

        int ans1;
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;
        if(dp[n-1] == -1){
            ans1 = f1(n-1,dp);
            dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }

        if(n%2 == 0){
            if(dp[n/2] == -1){
                ans2 = f1(n/2,dp);
                dp[n/2] = ans2;
            }else{
                ans2 = dp[n/2];
            }

        }

        if(n%3 == 0){
            if(dp[n/3] == -1){
                ans3 = f1(n/3,dp);
                dp[n/2] = ans2;
            }else{
                ans3 = dp[n/3];
            }

        }
        return Math.min(ans1,Math.min(ans2,ans3)) + 1;

    }

    public static int f(int n){
        if(n == 1){
            return 0;
        }

        int ans1 = f(n-1);
        int ans2 = Integer.MAX_VALUE;
        if(n%2 == 0)
            ans2 = f(n/2);
        int ans3 = Integer.MAX_VALUE;
        if(n%3 == 0)
            ans3 = f(n/3);

        return Math.min(ans1,Math.min(ans2,ans3)) + 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int dp [] = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        System.out.println(f1(n,dp));

    }
}
