package com.company;
import java.util.*;
public class total_car {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int two_wheller,four_wheller;
        if(w>=2 && n<w && w%2 == 0){
            four_wheller = (w - 2*n)/2;
            two_wheller = n - four_wheller;
            System.out.println("two wheller:"+two_wheller+" four wheller:"+four_wheller);
            return ;
        }
        System.out.println("invalid input");
    }
}
