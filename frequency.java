package com.company;
import java.util.*;

public class frequency {
    public static void main(String[] args){
        int a[] = {3,1,2};
        int n = a.length;
        int k=1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            arr.add(a[i]);
        }
        // HashSet<Integer> hashSet = new HashSet<>(arr);
        // for(int i : hashSet){
        //     System.out.println(i);
        // }
        //HashMap<Integer, Integer> map = new HashMap<>();
        // int ans =0;
        for(int i : arr){
            if(Collections.frequency(arr,i)>=k){
                //map.put(hashSet.get(i),Collections.frequency(ar,hashSet.get(i));
                //ans = i;
                System.out.println(i);
                return;
            }
        }
    }
}
