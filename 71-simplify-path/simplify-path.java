class Solution {
    public String simplifyPath(String path) {
        String[] temp=path.split("/");
        Stack<String> st=new Stack<>();
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i].equals(".")||temp[i].equals(""))
            continue;
            else if(temp[i].equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }}
                else
                st.push(temp[i]);
        }
        StringBuilder str=new StringBuilder();
        if(st.size()==0)
        str.append("/");
        for(int i=0;i<st.size();i++)
        {
            str.append("/");
            str.append(st.get(i));
        }
        return str.toString();
    }
}