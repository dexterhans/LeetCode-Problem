class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int x=nums.length;
        if(x==0)
            return 0;
        int count=1;
        int max=1;
        for(int i=0;i<x-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                count++;
            }
            else
            {
                if(max<count)
                    max=count;
                count=1;
            }
        }
        if(max<count)
            max=count;
        return max;
    }
}
