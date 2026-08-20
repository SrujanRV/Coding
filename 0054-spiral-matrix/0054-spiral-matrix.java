class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        
        while(left<=right && top<=bottom){

        
            for(int i=left; i<=right; i++){
                nums.add(matrix[top][i]);
            
            }
            top++;
            for(int j = top; j<=bottom; j++){
                nums.add(matrix[j][right]);
            
            }
            right--;

            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    nums.add(matrix[bottom][i]);
                    
                }
                bottom--;
            }

            if(left<=right){
                for(int j = bottom; j>=top;j--){
                    nums.add(matrix[j][left]);
            
                }
                left++;
            }
        }
        return nums;
        
    }
}