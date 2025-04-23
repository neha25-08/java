class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr=new char[n];
        Arrays.fill(arr,'a');
        k=k-n;
        int i=n-1;
        while(i>=0&&k>0)
        {
            int add=Math.min(25,k);
            arr[i]+=add;
            k-=add;
            i--;
        }
        return new String(arr);
    }
}


