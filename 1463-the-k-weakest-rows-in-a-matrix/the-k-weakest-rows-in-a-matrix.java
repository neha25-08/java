class Solution {
    class node implements Comparable<node>
    {
        int i;
        int s;
        node(int i,int s)
        {
            this.i=i;
            this.s=s;
        }
        @Override
        public int compareTo(node n2)
        {
            if(this.s==n2.s)
            {
                return this.i-n2.i;
            }
            return this.s-n2.s;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<node> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                count++;
            }
            pq.add(new node(i,count));
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++)
        {
            node res=pq.poll();
            arr[i]=res.i;
        }
        return arr;
    }
}