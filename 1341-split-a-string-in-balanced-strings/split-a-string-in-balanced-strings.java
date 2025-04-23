class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            l++;
            else
            r++;
            if(l==r)
            ans++;
        }
        return ans;
    }
}