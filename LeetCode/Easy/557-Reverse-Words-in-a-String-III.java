// Time: 1888 ms (5.1%), Space: 530.2 MB (5.1%)- this is because of the String concatenation in the for loop in the reverseWords method below.
class Solution {
    public String reverseWords(String s) {

        String ans = "";
        int start = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int end = (i == s.length() - 1) ? i : i - 1;

                for (int j = end; j > start; j--) {
                    ans = ans + s.charAt(j);
                }

                if (i != s.length() - 1) {
                    ans = ans + " ";
                }

                start = i;
            }
        }

        return ans;
    }

}