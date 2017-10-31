class Solution {
    public int missingNumber(int[] nums) {
     int x=nums.length;
        int res=x*(x+1)/2;
        int sum=0;
        
        for(int i=0;i<x;i++)
        {
            sum+=nums[i];
        }
        return res-sum;
    }
}
