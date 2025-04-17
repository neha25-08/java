class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int[] arr1=new int[10000];
        for(int i=0;i<arr.length;i++)
        {
            arr1[arr[i]]++;
        }
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i]==0)
            count++;
            if(count==k)
            return i;
        }
        return -1;
    }
}