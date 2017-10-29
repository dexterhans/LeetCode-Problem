class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int x=Math.abs(nums[i]);
            if(nums[x-1]>0)
            nums[x-1]=-nums[x-1];
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                list.add(i+1);
        }
        return list;
    }
}
