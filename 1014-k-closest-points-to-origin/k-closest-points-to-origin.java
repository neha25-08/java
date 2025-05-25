class Solution {
   static  class node implements Comparable<node>
    {
        int x;
        int y;
         int dis;
        node(int xx,int yy)
        {
            x=xx;
            y=yy;
            dis=x*x+y*y;
        }
        @Override
        public int compareTo(node n2)
        {
            return this.dis-n2.dis;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<node> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            pq.add(new node(points[i][0],points[i][1]));
        }
        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++)
        {
            node ans=pq.poll();
            arr[i][0]=ans.x;
            arr[i][1]=ans.y;
        }
        return arr;
    }
}