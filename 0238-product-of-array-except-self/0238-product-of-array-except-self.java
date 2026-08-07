class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        for (int i =0; i<= nums.length-2; i++){
            left[i+1] = left[i] * nums[i];

        }
        for (int j = nums.length-1; j>=1; j--){
            right[j-1] = right[j] * nums[j];
        }

        int[] ans = new int[nums.length];

        for(int k=0; k<=nums.length-1; k++){
            ans[k] = left[k] * right[k];
        }
        return ans;
    }
}