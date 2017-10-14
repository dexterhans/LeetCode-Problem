Class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
     int[][] reshaped_matrix=new int[r][c];
        if(nums.length*nums[0].length!=r*c)
            return nums;
        int row=0;
        int col=0;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums[0].length;j++)
            {
                reshaped_matrix[row][col]=nums[i][j];
                col++;
                col=col%c;
                if(col==0)
                    row++;
            }
        return reshaped_matrix;
    }
}
