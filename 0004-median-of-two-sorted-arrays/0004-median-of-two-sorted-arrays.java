class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m + n];

        for(int i=0; i<nums1.length; i++){
            temp[i] = nums1[i];
        }
        for(int j =0; j<nums2.length; j++){
            temp[nums1.length+j] = nums2[j];
        }
        Arrays.sort(temp);
        int x = temp.length;

        if(temp.length%2 ==0){
            int mid = x/2;
            int mid2 = x/2 -1;
            double ans = ((double)temp[mid]+(double)temp[mid2])/2;
            return ans;
        }
        else{
            int mid = x/2;
            return temp[mid];
        }
        
    }
}