class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr=new int[n];
        arr[0]=1;
        int i=1,x=1;
        int diff=n-1;
        while(k!=1)
        {
            if(i%2==0)
                x=x-diff;
            else
                x=x+diff;
            arr[i++]=x;
            diff--;
            k--;
        }
        if(i%2==0)
        {
        for(int j=i;j<arr.length;j++)
        {
            arr[j]=--x;
        }    
        }
        else
        {
             for(int j=i;j<arr.length;j++)
        {
            arr[j]=++x;
        }    
        }
        return arr;
    }
}
