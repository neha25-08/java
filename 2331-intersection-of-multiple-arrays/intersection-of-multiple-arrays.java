class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(hm.containsKey(nums[i][j]))
                {
                    hm.put(nums[i][j],hm.get(nums[i][j])+1);
                }
                else
                hm.put(nums[i][j],1);
            }
        } 
        Set<Integer> hs=hm.keySet();
        for(int i:hs)
        {
            if(hm.get(i)==nums.length)
            {
                ar.add(i);
            }
        }
        Collections.sort(ar);
        return ar;
    }
}