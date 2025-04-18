class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int[] arr=new int[nums.length-k+1];
        for(int i=0;i<k;i++)
        {
            while(q.size()>0&&nums[q.getLast()]<nums[i])
            {
                q.removeLast();
            }
            q.addLast(i);
        }
        int i=0;
        for(int j=k;j<nums.length;j++)
        {
            arr[i++]=nums[q.getFirst()];
            while(!q.isEmpty()&&(j-k+1)>q.getFirst())
            {
                q.removeFirst();
            }
            while(q.size()>0&&nums[q.getLast()]<nums[j])
            {
                q.removeLast();
            }
            q.addLast(j);
        }
         arr[i]=nums[q.getFirst()];
        return arr;
    }
}