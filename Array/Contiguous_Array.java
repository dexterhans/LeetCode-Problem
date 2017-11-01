class Solution {
    public int findMaxLength(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        hash.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum-=1;
            else
                sum+=1;
            if(hash.containsKey(sum))
            {
                max=Math.max(max,i-hash.get(sum));
            }
            else
                hash.put(sum,i);
        }
        return max;
    }
    
}
