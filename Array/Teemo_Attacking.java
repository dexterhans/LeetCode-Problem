class Solution {
    public int findPoisonedDuration(int[] timeseries, int duration) {
        int sum=0;
      if(timeseries.length==0)
          return 0;
        
     for(int i=0;i<timeseries.length-1;i++)   
     {
         int temp=timeseries[i]+duration-1;
         if(temp<timeseries[i+1])
             sum+=duration;
         else
             sum+=timeseries[i+1]-timeseries[i];
     }
        sum+=duration;
        return sum;
    }
}
