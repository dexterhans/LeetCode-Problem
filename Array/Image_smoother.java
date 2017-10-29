   public int[][] imageSmoother(int[][] M) {
        int row=M.length;
        int col=M[0].length;
        int[][] result=new int[M.length][M[0].length];
        
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                int count=0;
                int sum=0;
                for(int x:new int[]{-1,0,+1})
                {
                    for(int y:new int[]{-1,0,+1})
                    {
                        if(check(i+x,j+y,row,col)==true)
                        {
                            count++;
                            sum+=M[i+x][j+y];
                        }
                    }
                }
                result[i][j]=sum/count;
            }
     return result;    
    }
    public boolean check(int x,int y,int row,int col)
    {
        if(x<0 || y<0 || x>=row || y>=col)
            return false;
        return true;
    }
}
