class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        Deque<Integer> q=new ArrayDeque<>();
        int min=Integer.MAX_VALUE;
        int s;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!q.isEmpty())
            {
                q.addLast(nums[i]);
                sum+=nums[i];
            }
            else if(q.isEmpty())
            {
                q.addLast(nums[i]);
                sum=nums[i];
            }
            while(!q.isEmpty()&&sum>=target)
            {
                s=q.size();
                min=Math.min(s,min);
                sum-=q.removeFirst();
            }
        }
            if(sum<target&&nums.length==q.size())
            return 0;
        return min;
    }
}