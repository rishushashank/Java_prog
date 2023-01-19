package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class hallindrom {

    public static boolean palindrom(String s){
        // if(s.length() <2){
        //     return false;
        // }
        // boolean ans = false;
        // String rev = " ";
        // for(int i = s.length() - 1; i>= 0;i--){
        //     rev = rev + s.charAt(i);
        // }
        // System.out.println(s);
        // if(s.equals(rev) ){
        //     ans = true;
        // }
       int l=0,r=s.length()-1;
       while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
       }

        return true;
    }

    public static boolean halindrom(String s){
        if(s.length() <2){
            return false;
        }
        boolean ans = false;
        if(palindrom(s)){
            ans = true;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i =0;i<n;i++){
            s[i] = sc.next();
        }
        int c= 0;
        for(int i =0;i<n;i++){
            if(palindrom(s[i])){
                c++;
            }else{
                if(s[i].length() % 2 == 0){
                    if(halindrom(s[i].substring(0,(s[i].length() /2)))){
                        c++;
                    }else if(halindrom(s[i].substring(s[i].length()/2,s[i].length()))){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
