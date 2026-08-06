class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
       
        for (int i =0; i<=nums.length-1; i++){
            int count =0;
            for (int j =0; j<=nums.length-1; j++){
                if (nums[j] < nums[i]){
                    count ++;
                }
                smaller[i] = count;
                
               
                
            }
        }
        return smaller;
    }
}