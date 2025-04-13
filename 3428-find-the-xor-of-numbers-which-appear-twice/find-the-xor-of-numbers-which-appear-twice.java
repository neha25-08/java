class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] arr=new int[51];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i]]>1)
            {
                arr[nums[i]]--;
                sum^=nums[i];
            }
           
        }
        return sum;
    }
}