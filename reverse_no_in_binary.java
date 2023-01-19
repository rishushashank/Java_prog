package com.company;
import java.util.*;

public class reverse_no_in_binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        String str = String.format("%32s",Long.toBinaryString(n)).replace(" ","0");
        System.out.println(str);
        StringBuilder s = new StringBuilder(str);
        String ab=s.reverse().toString();
        Long ans = Long.parseLong(ab,2);
        System.out.println(ans);
    }
}
