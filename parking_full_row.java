package com.company;
import java.util.*;

public class parking_full_row {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr [][] = new int[r][c];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count =0;
        int max = 0;
        int row = -1;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(max<count){
                max = count;
                row = i+1;
            }
        }

        System.out.println(row);
    }
}
