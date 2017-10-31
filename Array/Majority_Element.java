class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int count=1;
        int length=nums.length;
        int i=1;
        while(i!=length)
        {
            if(a!=nums[i])
            {
                count--;
                
            if(count==0)
            {
                a=nums[i];
                count=1;
            }
            }
            else
                count++;
            i++;
        }
        return a;
    }
}
