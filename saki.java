
package com.company;
import java.util.*;
public class saki {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(a[i] >0){
                ans.add(a[i]);
            }
        }
        System.out.println(ans.get(ans.size()/2));
    }
}
