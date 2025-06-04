class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        Set<Integer> key=hm.keySet();
        HashSet<Integer> hs=new HashSet<>();
        for(int i:key)
        {
            if(hs.contains(hm.get(i)))
            {
                return false;
            }
            else
            {
                hs.add(hm.get(i));
            }
        }
        return true;
    }
}