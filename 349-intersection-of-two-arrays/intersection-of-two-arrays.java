class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]==nums2[j]&&(k==0||arr[k-1]!=nums1[i]))
            {
                arr[k++]=nums1[i];
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            j++;
        }
        while(i<nums1.length)
        {
            if(nums1[i]==nums2[j-1]&&(k==0||arr[k-1]!=nums1[i]))
            {
                arr[k++]=nums1[i];
            }
            i++;
        }

        while(j<nums2.length)
        {
            if(nums1[i-1]==nums2[j]&&(k==0||arr[k-1]!=nums2[j]))
            {
                arr[k++]=nums1[i-1];
            }
            j++;
        }
        return Arrays.copyOfRange(arr,0,k);
    }
}