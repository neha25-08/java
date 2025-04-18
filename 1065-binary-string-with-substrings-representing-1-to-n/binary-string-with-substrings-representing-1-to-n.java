class Solution {
   
    public boolean queryString(String s, int n) {
        String s1;
        Queue<String> q=new LinkedList<>();
        q.add("1");
        int i=1;

        while(i<=n)
        {
            s1=q.remove();
            if(!s.contains(s1))
            return false;
            q.add(s1+"0");
            q.add(s1+"1");
            i++;
        } 
        return true;
    }
}