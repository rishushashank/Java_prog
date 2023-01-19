package com.company;
import java.util.*;
import java.math.BigInteger;
public class tcs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        int opsize = (int)Math.pow(2, n);
        for (int counter = 1; counter < opsize; counter++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            // \
            for (int j = 0; j < n; j++)
            {
                if (BigInteger.valueOf(counter).testBit(j))
                    list.add(arr[j]);
            }
            for(int i =0;i<list.size();i++)
            //System.out.println(list.get(i));
            Collections.sort(list);
            int flag = 0;
            for(int i =0;i<list.size();i++){
                if(i+1 != list.get(i)){
                sum += i+1;
                flag = 1;
                }
            }
            if(flag == 0){
                sum += list.size();
            }
            //System.out.println();
        }
        System.out.println((sum+3) % 1000000007);

    }
}
