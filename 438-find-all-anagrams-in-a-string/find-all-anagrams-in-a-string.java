class Solution {
    boolean allZero(int[] arr)
    {
        for(int i:arr)
        {
            if(i!=0)
            return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {

        int[] arr=new int[26];
        ArrayList<Integer> ls=new ArrayList<>();
        if(p.length()>s.length())
        return ls;
        for(int i=0;i<p.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[p.charAt(i)-'a']--;
        }
        if(allZero(arr)==true)
        ls.add(0);

         for(int i=1;i<=s.length()-p.length();i++)
         {
            arr[s.charAt(i-1)-'a']--;
            arr[s.charAt(i+p.length()-1)-'a']++;
             if(allZero(arr)==true)
            ls.add(i);
         }
         return ls;
    }
}