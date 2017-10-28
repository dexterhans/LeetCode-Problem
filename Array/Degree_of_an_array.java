class Solution {
     class Result{
        int start;
        int val;
         
    }
    public int findShortestSubArray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
        }
        int[] hash=new int[max+1];
        int degree=0;
        for(int i=0;i<nums.length;i++)
        {
        int x=++hash[nums[i]];
            if(degree<x)
                degree=x;
        }
        Result[] ans=new Result[max+1];
        for(int i=0;i<ans.length;i++)
            ans[i]=new Result();
        int ret=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(ans[nums[i]].val==0)
            ans[nums[i]].start=i;
            ans[nums[i]].val++;
            if(ans[nums[i]].val==degree)
            {
                int temp=i-ans[nums[i]].start+1;
                if(temp<ret)
                    ret=temp;
            }
        }
        return ret;
    }
}
