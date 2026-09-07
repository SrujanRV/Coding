class Solution {
    public String longestPalindrome(String s) {

        String longest = "";

        for (int left = 0; left < s.length(); left++) {

            for (int right = s.length() - 1; right >= left; right--) {

                int i = left;
                int j = right;

                boolean palindrome = true;

                while (i < j) {

                    if (s.charAt(i) != s.charAt(j)) {
                        palindrome = false;
                        break;
                    }

                    i++;
                    j--;
                }

                if (palindrome && right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }
            }
        }

        return longest;
    }
}