package com.company;

public class f {
    public static void main(String[] args){
        String s = "rishu0";
        int n = s.length()/4;
        String a = s.substring(0,n);
            String b = s.substring(n,2*n);
            String c = s.substring(2*n,3*n);
            String d = s.substring(3*n,s.length());
            System.out.println(a+b+c+d);
        
    }
    
}
