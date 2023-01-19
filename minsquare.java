package com.company;

public class minsquare {

    public static int minsquarem(int n,int dp[]){

        if(n == 0 ){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int temp;
            if(dp[n-(i*i)] == -1){
                temp = minsquare(n-(i*i));
                dp[n-(i*i)] = temp;
            }else{
                temp = dp[n-(i*i)];
            }
            if(ans > temp){
                ans = temp;
            }
        }
        return ans+1;
    }

    public static int minsquare(int n){

        if(n == 0 ){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int temp = minsquare(n-(i*i));
            if(ans > temp){
                ans = temp;
            }
        }
        return ans+1;
    }
    public static void main(String[] args){
        int n = 41;
        int dp[] = new int[n+1];
        for(int i = 0;i<n;i++){
            dp[i] = -1;
        }
        System.out.println(minsquare(41));
        System.out.println(minsquarem(41,dp));
    }
}
