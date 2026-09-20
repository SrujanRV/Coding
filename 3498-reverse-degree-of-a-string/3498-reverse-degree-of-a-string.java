class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            char a = 'a';
            int number = 26 - (letter - a);
            int needed = number *(i+1);
            sum += needed;
        }
        return sum;
    }
}