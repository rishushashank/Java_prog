package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class aise
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String S = "hello";
        int[] sstr = new int[256];

        for(int i=0;i<S.length();i++){
            sstr[S.charAt(i)] +=1;
        }
        for(int i=0;i<sstr.length;i++){
            System.out.println(sstr[i]);
        }
//        Scanner sc= new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0){
//            String a = sc.next();
//            String b= sc.next();
//            int n= sc.nextInt();
//            String c[] = new String[n];
//            for(int i=0;i<n;i++){
//                c[i]=sc.next();
//            }
//            String parent = a+b;
//            String child = new String();
//            for(int i=0;i<n;i++){
//                child += c[i];
//            }
////            System.out.println(child);
////            System.out.println(parent);
//            for(int i =0;i<child.length();i++){
//                Character x = (child.charAt(i));
//                String s=String.valueOf(x);
//                if(!parent.contains(s))
//                    System.out.println("NO");
//            }
//            System.out.println("YES");
//        }
    }
}

//
//import java.util.ArrayList;
//import java.util.Arrays;
// class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//public class aise {
////    public static int climbStairs(int n) {
////        int c=0;
////        int ans=0;
////        if(ans == n){
////            c++;
////        }
////
////        c=c+climbStairs(n-1);
////        c=c+climbStairs(n-2);
////        return c;
////    }
//
//
////        public static void main(String[] args){
////            int a=0;
////            int b=1;
////            int c=0;
////            int ans=0;
////            while(c < 5){
////                ans = a+b;
////                System.out.println(ans);
////                a=b;
////                b=ans;
////                c++;
////            }
//
//
//
//
//        public ListNode deleteDuplicates(ListNode head) {
//                ListNode newhead = new ListNode();
//                ListNode tail = head.next;
//                while(tail.next!=null){
//                        if(tail.val == tail.next.val){
//                                tail.next = tail.next.next;
//                                continue;
//                        }
//                        tail = tail.next;
//                }
//                newhead.next = tail;
//
//                return newhead;
//        }
//
//
////            int nums[] = {0,0,1,1,1,2,2,3,3,4};
////            int c =0;
////
////            for(int i =0;i< nums.length;i++){
////                if(nums[i] == nums[i+1] && i <nums.length-1){
////                   continue;
////                }
////            }
////
////            System.out.println(c);
////            System.out.println(num);
//
//
//        }
//
//}
