package com.company;
import java.util.*;

public class pair_sum {
    public static void main(String[] args){
       int n = 7;
int matrix[][] = {{7,
    68 ,35, 1, 70, 25 ,79},{59 ,
    63 ,65, 6, 46, 82, 28},{ 62, 
    92, 96 ,43 ,28, 37, 92},{ 5,
    3, 54, 93, 83, 22, 17},{ 19 ,
    96, 48, 27, 72, 39, 70}, {13, 
    68, 100, 36, 95, 4 ,12}, {23, 
    34 ,74, 65, 42, 12, 54, 69}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(matrix[i][j]);
            }
        }
        int m=1;
       for(int i=0;i<n;i++){
           int k=n-m;
            for(int j=0;j<n;j++){
                matrix[i][j]=list.get(k);
                k+=n;
            }
            m++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
