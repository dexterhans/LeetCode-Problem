class Solution {
    public int triangleNumber(int[] nums) {
       // Arrays.sort(nums);
        int x=nums.length;
        int count=0;
        for(int i=0;i<x;i++)
        {
            loop:
        for(int j=i+1;j<x;j++)
            {
                for(int k=j+1;k<x;k++)
                {
                    if(nums[i]+nums[j]>nums[k] && nums[i]+nums[k]>nums[j] && nums[k]+nums[j]>nums[i])
                    {
                        count++;
                       // System.out.println(nums[i]+"  "+i+"     "+ nums[j]+"   "+j+"    "+nums[k]);
                    }
                
                }
            }
        }
        return count;
    }
}
