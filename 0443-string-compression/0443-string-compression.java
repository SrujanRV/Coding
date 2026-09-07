class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<chars.length; i++){
            int count =1;
            for(int j =i+1; j<chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            str.append(chars[i]);
            if(count>1){
                str.append(count);
                
            }
        
            i = i+count-1;

        }
        for(int i = 0; i < str.length(); i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}