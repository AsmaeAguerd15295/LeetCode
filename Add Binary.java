/*Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 
Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        
        // Pointers to the end of the strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        // Traverse both strings from the end
        while (i >= 0 || j >= 0 || carry != 0) {
            int first = (i >= 0) ? a.charAt(i) - '0' : 0; // Get digit from 'a' or 0 if exhausted
            int second = (j >= 0) ? b.charAt(j) - '0' : 0; // Get digit from 'b' or 0 if exhausted
            
            int sum = first + second + carry; // Add digits and carry
            sb.append(sum % 2); // Append the binary digit
            carry = sum / 2; // Update carry
            
            // Move to the previous digits
            i--;
            j--;
        }
        
        // Reverse the result to get the correct binary sum
        return sb.reverse().toString();
    }
}
