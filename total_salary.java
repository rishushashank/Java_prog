package com.company;

import java.util.Scanner;

public class total_salary {
    public static void total_salary(int b_salary,char grade){
        double allow = 0;
        double hra = 0.2*b_salary;
        double da = 0.5*b_salary;
        switch (grade){
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            case 'C':
                allow = 1300;
                break;
        }
        double pf = 0.11*b_salary;
        System.out.println(Math.round(b_salary+hra+da+allow - pf));
//        totalSalary = basic + hra + da + allow – pf
//        where :
//        hra   = 20% of basic
//                da    = 50% of basic
//                allow = 1700 if grade = ‘A’
//        allow = 1500 if grade = ‘B’
//        allow = 1300 if grade = ‘C' or any other character
//        pf    = 11% of basic.

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        String str = sc.next();
        total_salary(salary,str.charAt(0));
    }
}
