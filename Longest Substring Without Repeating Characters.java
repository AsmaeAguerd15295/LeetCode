/*Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        

        while (end < s.length()) {
            char currentChar = s.charAt(end);
            if (charSet.contains(currentChar)) {
                // Remove from start until the duplicate is gone
                charSet.remove(s.charAt(start));
                start++;
            } else {
                // Add the character to the set
                charSet.add(currentChar);
                // Update maxLength here, because the substring is valid
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }
        }
        return maxLength;
    }
}
