class Solution {
    public int jump(int[] nums) {
        int i=nums.length-1;
        int count=0;
        for(int j=0;j<i;j++)
        {
            if(nums[j]>=i-j)
            {
                count++;
                 i=j;
                 j=-1;
            }
        }
        return count;
    }
}