/*class Solution {
    public int maxScore(int[] arr, int k)
    {
        int l =arr.length-k;
        int maxsum=0;
        int sum=0;
        for(int i=arr.length-k;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<k;i++)
        {
             maxsum=Math.max(sum, maxsum);
            sum+=arr[i];
            sum-=arr[l];
            l++;
        }
        return maxsum;
    }
}
*/



class Solution {
    public int maxScore(int[] arr, int k) {
        int l =arr.length-k;
        int maxsum=0;
        int sum=0;
        for(int i=arr.length-k;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<k;i++){
             maxsum=Math.max(sum, maxsum);
            sum+=arr[i];
            sum-=arr[l];
            l++;
           

        }
          maxsum=Math.max(sum, maxsum);
        return maxsum;
    }
}