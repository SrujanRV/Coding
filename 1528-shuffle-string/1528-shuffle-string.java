class Solution {
    public String restoreString(String s, int[] indices) {
        
        char []b = new char[s.length()]; 
        for (int i =0; i<s.length(); i++){
            int pos = indices[i];
            b[pos] = s.charAt(i);
        }
        
        return new String(b);
    }
}