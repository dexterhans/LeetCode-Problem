class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[Math.abs(nums[i])-1];
            if(x<0)
                l.add(Math.abs(nums[i]));
           nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];   
        }
      
        return l;
    }
}
