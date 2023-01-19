public class subarray_sum {
    public static void main(String[] args){
        int nums[] = {4,5,0,-2,-3,1};
        int k=5;
        int c = 0;
        for(int i=0;i<nums.length;i++){
                int sum=0;
                for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    System.out.println(sum);
                    if((sum)%k == 0){
                        c++;
                    }
                }
                System.out.print(c);
            
        }
    }
}
