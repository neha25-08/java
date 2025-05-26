class Solution {
    
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int x=hm.get(nums[i]);
                hm.put(nums[i],x+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int n=nums.length/3;
        ArrayList<Integer> ar=new ArrayList<>();
    //Set<String> sb=hm.keySet();

        Set<Integer> key=hm.keySet();
        for(Integer k:key)
        {
            if(hm.get(k)>n)
            ar.add(k);
        }
        return ar; 
    }
}