package com.company;

import java.util.*;
public class fn_dl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // int a [] = new int [str.length()];
        // for(int i=0;i<str.length();i++){
        //     //String s = a-str.charAt(i);
        //     Char s = str.charAt(i);
        //     int n = Integer.parseInt(a) - Integer.parseInt(s);
        //     a[n]++;
        // }
        // Sysem.out.println(-1);
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i =0;i<str.length();i++)
            // if(h.containsKeys(str.charAt(i))){
            //     h.put(s.charAt(i),h.get(s.charAt(i))+1);
            // }else{
            //     h.put(s.charAt(i),1);
            // }
            h.put(str.charAt(i),h.getOrDefault(str.charAt(i),0)+1);

            char u = str.charAt(0);
            boolean found = false;
            
        for(Map.Entry<Character,Integer> e : h.entrySet()){
            if(e.getValue()==1){
            u = e.getKey();
            found = true;
            break;
            }
        }
            if(found){
                System.out.println(str.indexOf(u)+1);
            }
            else
            System.out.println(-1);
        
    }
}