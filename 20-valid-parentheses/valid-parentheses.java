class Solution {
    public boolean isValid(String s) {
       Stack<Character> st=new Stack<>();
       if(s.length()<2)
       return false;
      // st.push(s.charAt(0));
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
        st.push(s.charAt(i));
        else{
        if(st.isEmpty()==true)
        return false;
        if(st.peek()=='('&&s.charAt(i)==')')
        st.pop();
        else if(st.peek()=='{'&&s.charAt(i)=='}')
         st.pop();
         else if(st.peek()=='['&&s.charAt(i)==']')
         st.pop();
         else 
        return false;
        }
       } 
       return st.isEmpty();
    }
}