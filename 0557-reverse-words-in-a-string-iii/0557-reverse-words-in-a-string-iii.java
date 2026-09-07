class Solution {
    public String reverseWords(String s) {
        
        StringBuilder str = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                word.append(s.charAt(i));

            }
            else{
                str.append(word.reverse());
                str.append(' ');
                word.setLength(0);
            }

        }
        str.append(word.reverse());
        return str.toString();

    }
}