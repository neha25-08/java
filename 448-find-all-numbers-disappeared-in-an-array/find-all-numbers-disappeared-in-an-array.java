class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=new int[nums.length+1];
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]-1]++;
        }
         for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==0)
            ls.add(i+1);
        }
        return ls;
    }
}