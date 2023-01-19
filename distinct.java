package com.company;
import java.util.*;
public class distinct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =n;i<9000;i++){
            //System.out.println(i);
            String s  = String.valueOf(i);
            HashSet<Integer> set = new HashSet<>();
            for(int c : s.toCharArray() ){
                set.add(c);
            }
            if(s.length() == set.size()){
                System.out.println(i);
                break;
            }
        }
       

    }
}
