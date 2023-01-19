package com.company;

import java.util.ArrayList;
class query{
    int l,r;
    query(int l,int r){
        this.l = l;
        this.r = r;
    }
}

public class mos {

    public static void solve(int a[],int n,ArrayList<query> q,int k){
        for(int i =0;i<k;i++){
            int l = q.get(i).l;
            int r = q.get(i).r;

            int s = 0;
            for(int j = l;j<=r;j++){
                s+=a[j];
            }
            System.out.println("sum of ["+l + ","+r+"] is: " +s);
        }
    }
    
   public static void main(String[] args){
        int a[] ={1, 1, 2, 1, 3, 4, 5, 2, 8};
        ArrayList<query> q = new ArrayList<>();
        q.add(new query(0,4));
        q.add(new query(1,3));
        q.add(new query(2,4));
        solve(a,a.length,q,q.size());
    }
}
