class Solution {
    public boolean canJump(int[] nums) {
        int i=nums.length-1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]>=(i-j))
                {
                    i=j;
                }
            }
        
        if(i==0)
        return true;
        return false;
    }
}