class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]))
            hs.put(nums[i],hs.get(nums[i])+1);
            else
            hs.put(nums[i],1);
        } 
        int sum=0;
        Set<Integer> key=hs.keySet();
        for( int i:key)
        {
            int x=hs.get(i);
            if(x==1)
            sum+=i;
        }
        return sum;
    }
}