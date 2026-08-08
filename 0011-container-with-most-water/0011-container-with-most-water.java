class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length -1;
        int ans = 0;
        while(left<right){
            int a = height[left];
            int b = height[right]; 
            int area = Math.min(a, b) * (right - left);
            ans = Math.max(ans, area);
            if(a>b){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
        

        
        
       
    }
}