class Solution {
    public String countAndSay(int n) {
        if(n==1)
        return "1";

        if(n==2)
        return "11";

        String str=countAndSay(n-1);
        String temp="";
        int count =1;
        int i;
        for( i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else{
                temp+=Integer.toString(count);
                temp+=str.charAt(i-1);
                count =1;
            }
        }
        temp+=Integer.toString(count);
                temp+=str.charAt(i-1);
        return temp;
    }
}