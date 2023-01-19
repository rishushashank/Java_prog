package com.company;
import java.util.*;

public class pallindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String s = "Rishu";
        String s = Integer.toString(n);
        char str[] = s.toCharArray(); 
        for(int i=0;i<str.length/2;i++){
            if(str[i] != str[str.length-1-i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
