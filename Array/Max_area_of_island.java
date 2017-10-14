class Solution {
    public int dfs(int[][] grid,int i,int j,int max)
    {
        grid[i][j]=0;
        int row=grid.length;
        int col=grid[0].length;
        if(i+1<row &&  grid[i+1][j]==1)
        {
           
            max=max+dfs(grid,i+1,j,0);
           
        }
        if(i-1>=0 &&  grid[i-1][j]==1)
        {
            
            max=max+dfs(grid,i-1,j,0);
            
        }
         if(j+1<col &&  grid[i][j+1]==1)
         {
            
            max=max+dfs(grid,i,j+1,0);
             
         }
        if(j-1>=0 && grid[i][j-1]==1)
        {
           
            max=max+dfs(grid,i,j-1,0);
            
        }
        
        return max+1;
    }
    public int maxAreaOfIsland(int[][] grid){
       
        int max=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int temp=dfs(grid,i,j,0);
                    if(temp>max)
                        max=temp;
                }
            }
      
        return max;
    }
}
