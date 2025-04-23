class Solution {
    public boolean canJump(int[] nums) {
        int i=nums.length-1;
        
        while(i>0)
        {
            int flag=0;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]>=(i-j))
                {
                    i=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            return false;
        }
        if(i==0)
        return true;
        return false;
    }
}