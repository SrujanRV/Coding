class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        int num = Integer.MIN_VALUE;
        int count = -1;
        for(int i =0; i< len; i++){
            if(nums[i] != num){
                num = nums[i];
                count +=1;
                arr[count] = nums[i];
                
            }

        }
        
        for (int j = 0; j <=count; j++){
            nums[j] = arr[j];
        }
        return count +1;
    }
}