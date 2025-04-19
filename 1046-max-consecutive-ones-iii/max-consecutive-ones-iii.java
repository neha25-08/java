class Solution {
    public int longestOnes(int[] nums, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        int count =0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count++;
            q.addLast(nums[i]);
            while(count>k)
            {
                if(q.removeFirst()==0)
                count--;
            }
            max=Math.max(max,q.size());
        }
        return max;
    }
}