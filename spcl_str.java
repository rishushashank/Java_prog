package com.company;
import java.util.*;
public class spcl_str{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            // if(h.containsKey(s.charAt(i))){
            //     h.put(s.charAt(i),h.get(s.charAt(i))+1);
            // }else{
            //     h.put(s.charAt(i),1);
            // }
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e : h.entrySet()){
            if(e.getValue() < min)
             min = e.getValue();
        }
        System.out.println(min);
    }
}
