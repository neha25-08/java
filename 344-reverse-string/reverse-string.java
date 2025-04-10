class Solution {
    public void reverseString(char[] s) {
      Stack<Character> sc=new Stack<>();
      int i=0;
      while(i!=s.length)
      {
        sc.push(s[i]);
        i++;
      } 
      i=0;
        while(i!=s.length)
      {
        s[i]=sc.pop();
        i++;
      }
    }
}