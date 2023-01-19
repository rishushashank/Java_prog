package com.company;
import java.util.*;

public class kString {
    public static int dist(String s ){
        int n=0;
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        n = set.size();
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int c = 0,a=0;
        for(int i=0;i<s.length();i++){
            String substr = "";
            for(int j=i;j< s.length();j++){
                substr += s.charAt(j);
//                System.out.println(substr);
                if(substr.length()==k) {
                     a = dist(substr);
                    if(a == k-1){
                        c++;
                    }
                }

            }
        }
        System.out.println(c);
    }
}
