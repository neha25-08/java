class Solution {
    ArrayList<List<Integer>> arr=new ArrayList<>();
    void fun(int[] nums,int i,List<Integer> cur)
    {
        if(i==nums.length)
        {
            arr.add(new ArrayList<>(cur));
            return ;
        }
        fun(nums,i+1,cur);
        cur.add(nums[i]);
        fun(nums,i+1,cur);
         cur.remove(cur.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> cur=new ArrayList<>();
      fun(nums,0,cur);
      return arr;  
    }
}