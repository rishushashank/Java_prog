package com.company;

import java.util.*;
public class count_spcl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c1=0,c2=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '*'){
                c1++;
            }else if(str.charAt(i) == '#' ){
                c2++;
            }
        }
        System.out.println(Math.abs(c1-c2));
    }
    
}
