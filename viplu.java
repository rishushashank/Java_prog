package com.company;
import java.util.*;
public class viplu {
    public static int marathon(int input1,int input2,int input3[]){





        int n  = input1;
        int k =input2;
        int arr[] = input3;
        Arrays.sort(arr);
        int sum = 0;
        for(int i =0;i<k;i++){
            sum += arr[n-1-i];
        }
        return sum;






        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // int sum = 0;
        // for(int i =0;i<k;i++){
        //     sum += arr[n-1-i];
        // }
        System.out.println( marathon(n,k,arr));
    }



    // public static int[] placement(int input1,int[] input2){




    //     int n = input1;
    //     int arr[] = input2;
    //     int count=0;
    //     int ans[] = new  int[n];
    //     for(int i =0 ;i<n;i++){
    //         count = 0;
    //         for(int j =0;j<=i;j++){
    //             int num = arr[j] - arr[i];
    //             if(num > 0){
    //                 count++;
    //             }
    //         }
    //         ans[i] = count;
    //     }
        
    //     return ans;



        
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int n = sc.nextInt();
    //     int count = 0;
    //     int arr [] = new int[n];
    //     for(int i =0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int arr1[] = new int[n];
    //     arr1 = placement(n,arr);
    //     for(int i =0 ;i<n;i++)
    //     System.out.println(arr1[i]);
        
    // }
}
