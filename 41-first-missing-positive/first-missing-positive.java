class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int flag=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                flag=i;
                break;
            }
        }
        if(flag==-1)
        return 1;
        
        for(int i=flag+1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]>1)
            return nums[i-1]+1;
        }
        return nums[nums.length-1]+1;
    }
}