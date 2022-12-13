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

// Time: 23 ms (38.54%), Space: 49.8 MB (53.57%)- this is because of the
// StringBuilder in the reverseWords method below. The String concatenation is
// O(n^2) while StringBuilder.append() is O(n).
class Solution2 {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int lastSpaceIndex = -1;
        for (int strIndex = 0; strIndex < s.length(); strIndex++) {
            if ((strIndex == s.length() - 1) || s.charAt(strIndex) == ' ') {
                int reverseStrIndex = (strIndex == s.length() - 1) ? strIndex : strIndex - 1;
                for (; reverseStrIndex > lastSpaceIndex; reverseStrIndex--) {
                    result.append(s.charAt(reverseStrIndex));
                }
                if (strIndex != s.length() - 1) {
                    result.append(' ');
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(result);
    }
}

// Time: 3 ms (99.93%), Space: 42.4 MB (98.6%)- this is because of the char[] in
// the reverseWords method below. The String concatenation is O(n^2) while
// StringBuilder.append() is O(n). The char[] is O(n) and the for loop is O(n).
class Solution3 {
    public String reverseWords(String s) {

        final int len = s.length(); // saving the length as constant so as to avoid calling s.length() again and
                                    // again.

        if (len == 1) // no need to iterate if string is of length 1
            return s;

        int firstIndex, lastIndex;
        char[] ch = s.toCharArray(); // converting the string into it's corresponding character array
        char temp;

        for (int index = 0; index < len; index++) {

            firstIndex = index; // store the first index of word

            while (++index < len && ch[index] != ' ')
                ; // iterate until space is found i.e. to get the last index of the word

            lastIndex = index - 1; // store the last index of the word

            // reverse characters of the word
            while (firstIndex < lastIndex) {
                temp = ch[firstIndex];
                ch[firstIndex++] = ch[lastIndex];
                ch[lastIndex--] = temp;
            }
        }

        return new String(ch); // convert the character into string and return it
    }
}