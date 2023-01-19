package com.company;
import java.util.Scanner;

public class newjava2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int th = h*m;
        int te = 0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            //System.out.println(n);
            te+=a[i];
            if(n == 1){
                System.out.println(--n);
                break;
            }
            if(th<te){
                System.out.println(n);
                break;
            }
            else{
            n--;
            }
            
        }
        // for(int i=0;i<n;i++){
        //     if(h<a[i]){
        //         th-=h;
        //     }
        //     else{
        //         //c++;
        //         h-=a[i];
        //         th-=a[i];
        //     }
        //}
    }
}
