class Solution {
    
    int max(int[] arr)
    {
        int i=0;
        int res=0;
        while(i<arr.length)
        {
            res=(arr[res]>arr[i])?res:i;
            i++;
        }
        
        //arr[res]=0;
        return res;    
    }
    
    public String frequencySort(String s) {
        int[] arr=new int[128];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();)
        {
           int x=max(arr);
            for(int j=0;j<arr[x];j++)
            {
                sb.append((char)(x));
            }
            i+=arr[x];
            arr[x]=0;
            
        }
        
        return sb.toString();
    }
}