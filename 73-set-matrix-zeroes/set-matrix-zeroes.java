class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        //System.out.print(matrix.length);
        //System.out.print(matrix[0].length);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ArrayList<Integer> ar=new ArrayList<>();
                if(matrix[i][j]==0)
                {
                    ar.add(i);
                    ar.add(j);
                    res.add(ar);
                }
            }
        }
        for(int k=0;k<res.size();k++)
        {
            ArrayList<Integer> as=new ArrayList<>();
            as=res.get(k);
            int row=as.get(0);
            int col=as.get(1);
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][col]=0;
            }
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[row][i]=0;
            }
        }
    }
}