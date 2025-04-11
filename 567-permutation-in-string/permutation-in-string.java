class Solution {
    boolean allZero(int[] a)
    {
        for(int i: a)
        if(i!=0) 
        return false;
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length();
        if(s2.length()<s1.length())
        {
            return false;
        }
        //s2+=s2;
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            arr[s1.charAt(i)-'a']--;
            arr[s2.charAt(i)-'a']++;
        }
        if (allZero(arr)) return true;
        //return true;
        for(int i=1;i<=n-s1.length();i++)
        {
             arr[s2.charAt(i-1)-'a']--;
             arr[s2.charAt(i+s1.length()-1)-'a']++;
            if (allZero(arr))
            return true;
        }
        return false;
    }
}