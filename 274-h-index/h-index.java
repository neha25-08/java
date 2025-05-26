class Solution {
    public int hIndex(int[] citations) {
        int count=0;
        int n=citations.length-1;
        Arrays.sort(citations);//,Collections.reverseOrder()//
        for(int i=citations.length-1;i>=0;i--)
        {
            if(citations[i]>=count+1)
            count++;
            else
            break;
        }
        return count;
    }
}