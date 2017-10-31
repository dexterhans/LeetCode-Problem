class Solution {
    public boolean isOneBitCharacter(int[] bits) {
     int x=bits.length;
        int l=0;
        if(x==1)
         return true;
        if(bits[x-2]==0)
            return true;
        else
            {
            
            while(l<x-1)
            {
                if(bits[l]==1)
                {
                    l+=2;
                }
                else
                    l++;
            }
            if(l==x-1)
                return true;
            else
                return false;
            
            }
        
    }
}
