class Solution {
    public int firstUniqChar(String s) {
        int result =-1;
        for(int i =0; i<s.length(); i++){
            int count =0;
            for(int j =0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    if(count>1){
                        break;
                    }
                }
                
            }
            if (count==1){
                result =i;
                break;
            }
            
        }
        return result;
    }
}