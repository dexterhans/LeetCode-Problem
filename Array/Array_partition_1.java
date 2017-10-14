class Solution {
    public int arrayPairSum(int[] nums) {
     int[] temp=new int[20001];
        for(int i=0;i<nums.length;i++)
        {
            temp[nums[i]+10000]++;
        }
        int sum=0;
        boolean boo=true;
        for(int i=0;i<temp.length;i++)
        {
            while(temp[i]!=0)
            {
                if(boo)
                    sum+=(i-10000);
                boo=!boo;
                temp[i]--;
            }
        }
        return sum;
    }
}
