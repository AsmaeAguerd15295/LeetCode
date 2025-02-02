/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0; // Initialize the result to store the column number
        
        for (int i = 0; i < columnTitle.length(); i++) {
            // Get the numeric value of the current character
            int numericValue = columnTitle.charAt(i) - 'A' + 1;
            // Update the result using base-26 logic
            result = result * 26 + numericValue;
        }
        
        return result; // Return the final column number
    }
}
