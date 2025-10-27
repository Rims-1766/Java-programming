class Solution {
    public void sortColors(int[] nums) {
        int count0 =0,count1 =0,count2 =0;
        for(int n : nums){
            if (n == 0) count0++;
            else if(n == 1)count1++;
            else count2++;
        }
        int i=0;
        while(count0-->0)nums[i++]=0;
        while(count1-->0)nums[i++]=1;
        while(count2-->0)nums[i++]=2;
    }
}
