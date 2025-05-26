class Solution {
    class node implements Comparable<node>
    {
        int val;
        int count;
        node(int v,int c)
        {
            val=v;
            count=c;
        }

        @Override
        public int compareTo(node n2)
        {
            return n2.count-this.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<node> pq=new PriorityQueue<node>();
        int cur=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==cur)
            {
                count++;
            }
            else
            {
                pq.add(new node(cur,count));
                count=1;
                cur=nums[i];
            }
        }
          pq.add(new node(cur,count));
        int i=0;
        ArrayList<Integer> ar=new ArrayList<>();
        while(i<k)
        {
            node ex=pq.poll();
            ar.add(ex.val);
            i++;
        }
       /* int[] arr=new int[i];
        for(int i=0;i<nums.length;i++)
        {
             node ex=pq.poll(i);
            arr[i]=ex.val;
        }*/
        int[] arr=new int[ar.size()];
        for(int j=0;j<ar.size();j++)
        {
            arr[j]=ar.get(j);
        }
        return arr;
    }
}