class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int a=0;
        int b=numbers.length-1;
        int x=numbers[a]+numbers[b];
        while(x!=target)
        {
            if(x>target)
            {
                b--;
            }
            else
                a++;
            x=numbers[a]+numbers[b];
        }
        return new int[]{a+1,b+1};
    }
}
