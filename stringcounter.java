package com.company;
import java.util.*;

public class stringcounter {
    public static int count(String str){




        int answer = 0;
        HashMap<Character,Integer> map=new HashMap<>();
       for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
           
    }
    for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        
            if(map.get(ch)==1)
            answer++;
        }

        return answer;




    }
    public static void main(String[] args){
        String str = "alphaadida";
        System.out.println(count(str));
    }
}
