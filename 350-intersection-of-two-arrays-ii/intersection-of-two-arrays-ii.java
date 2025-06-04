class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            hm.put(nums1[i],hm.get(nums1[i])+1);
            else
            hm.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++)
        {
             if(hm.containsKey(nums2[i]))
             {
                int x=hm.get(nums2[i]);
                ar.add(nums2[i]);
                if(x==1)
                hm.remove(nums2[i]);
                else
                hm.put(nums2[i],hm.get(nums2[i])-1);
             }
        }
        int[] arr=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            arr[i]=ar.get(i);
        }
        return arr;
    }
}