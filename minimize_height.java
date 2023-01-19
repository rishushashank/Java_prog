// package com.company;
// import java.util.*;

// /////NOPSystem.out.println(i+1);E

// public class minimize_height {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int k =sc.nextInt();
//         Arrays.sort(arr);
//         int small = arr[0]+k;
//         int largest = arr[n-1]-k;
//         int ans = largest - small;
//         int min=0,max=0;

//         for(int i =1;i<n-1;i++){
//             max = Math.max(largest,arr[i]+k);
//             min = Math.min(small,arr[i]-k);
//             if(min < 0)
//             continue;

//             ans = max- min;
//         }
//         System.out.println(ans);
//     }
// }
// int diff=arr[n-1]-arr[0];
//        int min=arr[0];
//        int max=arr[n-1];
//        for(int i=1;i<n;i++)
//        {
//            if(arr[i]<k)
//            continue;
//             min=Math.min(arr[0]+k,arr[i]-k);
//             max=Math.max(arr[n-1]-k,arr[i-1]+k);
//            diff=Math.min(diff,max-min);
//        }
//        return  diff;