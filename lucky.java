package com.company;
import java.util.*;
public class lucky {
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String s = Integer.toString(n);
       int len = s.length();
       if(len %2 !=0)
        return;
        int sum = 0;
        int sum2 = 0;
       for(int i =0;i<len/2;i++){
        sum += Integer.parseInt(String.valueOf(s.charAt(i)));
       }
       for(int i =(len/2);i<len;i++){
        sum2 += Integer.parseInt(String.valueOf(s.charAt(i)));
       }
       if(sum == sum2){
        System.out.println("YES"+sum+" "+ sum2);
       }
       else{
        System.out.println("NO"+sum+" "+ sum2);
       }

    }
}
