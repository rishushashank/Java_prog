package com.company;
import java.util.*;

public class lcm {
    // public static Long[] l(Long a,Long b){
    //     Long arr[] = new Long[2];
    //     Long n1 = a;
    //     Long n2 = b;
    //     while(true){
    //         if(n1%n2 == 0){
    //             arr[0] = n2;
    //             break;
    //         }
    //         Long temp = n2;
    //         n2 = n1%n2;
    //         n1 = temp;
            
    //     }
    //     arr[1] = (a*b)/arr[0];
    //     return arr;
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long n1 = a;
        Long n2 = b;
        while(a%b != 0){
            Long rem = a%b;
            a = b;
            b = rem;
        }
        Long gcd = b;
        Long lcm = (n1*n2)/b;
        System.out.println(gcd+" "+lcm);
        //return Long[]{gcd,lcm};
        // Long ans [] = l(Math.max(a,b),Math.min(a,b));
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
    }
}
