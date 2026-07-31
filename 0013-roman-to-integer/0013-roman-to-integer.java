class Solution {
    public int romanToInt(String s) {

        int num = 0;

        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (i < n - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                num += 4;
                i++;
            }
            else if (i < n - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                num += 9;
                i++;
            }
            else if (i < n - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                num += 40;
                i++;
            }
            else if (i < n - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                num += 90;
                i++;
            }
            else if (i < n - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                num += 400;
                i++;
            }
            else if (i < n - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                num += 900;
                i++;
            }
            else if (s.charAt(i) == 'I') {
                num += 1;
            }
            else if (s.charAt(i) == 'V') {
                num += 5;
            }
            else if (s.charAt(i) == 'X') {
                num += 10;
            }
            else if (s.charAt(i) == 'L') {
                num += 50;
            }
            else if (s.charAt(i) == 'C') {
                num += 100;
            }
            else if (s.charAt(i) == 'D') {
                num += 500;
            }
            else if (s.charAt(i) == 'M') {
                num += 1000;
            }
        }

        System.out.println(num);
        return num;
    }
}