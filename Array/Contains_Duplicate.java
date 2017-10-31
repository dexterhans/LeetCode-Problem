class Solution {
    public boolean containsDuplicate(int[] nums) {
        int x=nums.length;
        if(x==0)
            return false;
        int min,max;
        min=max=nums[0];
        for(int i=1;i<x;i++)
        {
            if(min>nums[i])
                min=nums[i];
                else if(max<nums[i])
                    max=nums[i];
        }
        int[] hash=new int[max-min+1];
        for(int i=0;i<x;i++)
        {
            if(hash[nums[i]-min]==1)
                return true;
            hash[nums[i]-min]++;
        }
        return false;
    }
}
