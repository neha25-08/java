class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> left=new Stack<>();
        Stack<Integer> right=new Stack<>();
        int n=heights.length;
        int[] arr=new int[n];
        int[] arl=new int[n];
        arl[0]=-1;
        left.push(0);
        for(int i=1;i<n;i++)
        {
            while(!left.isEmpty()&&heights[left.peek()]>=heights[i])
            {
                left.pop();
            }
            if(left.isEmpty())
            {
                arl[i]=-1;
            }
            else
            {
                arl[i]=left.peek();
            }
            left.push(i);
        }


        arr[n-1]=n;
        right.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!right.isEmpty()&&heights[right.peek()]>=heights[i])
            {
                right.pop();
            }
            if(right.isEmpty())
            {
                arr[i]=n;
            }
            else
            {
                arr[i]=right.peek();
            }
            right.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            int cur=heights[i]*(arr[i]-arl[i]-1);
            max=Math.max(cur,max);
        }
        return max;
    }
}