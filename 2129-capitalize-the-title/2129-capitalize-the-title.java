class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder word = new StringBuilder();
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i< title.length(); i++){
            if(title.charAt(i)!=' '){
                word.append(title.charAt(i));

            }
            else{
                if(word.length()<=2){
                    String a = word.toString().toLowerCase();
                    str.append(a);
                }
                else{
                    StringBuilder b = new StringBuilder(word.toString().toLowerCase());
                    b.setCharAt(0, Character.toUpperCase(b.charAt(0)));
                    str.append(b);
                }
                str.append(' ');
                word.setLength(0);
            }
        }
        if (word.length() <= 2) {
            str.append(word.toString().toLowerCase());
        }
        else {
            StringBuilder b = new StringBuilder(word.toString().toLowerCase());
            b.setCharAt(0, Character.toUpperCase(b.charAt(0)));
            str.append(b);
        }
        
        return str.toString();
    }
}