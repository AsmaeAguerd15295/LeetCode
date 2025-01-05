/*Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-231 <= x <= 231 - 1
Follow up: Could you solve it without converting the integer to a string?*/


import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        
       
         
        int reverse =0;
        int last; 
        int number =x;
        if (number < 0)
            return false;
        else{
            while(number > 0){
                last = number % 10;
                reverse = (reverse*10) +last;
                number= number/10;
                System.out.println(reverse);
             } 
           
            if (reverse == x)
                return true;
            else 
                return false;
        }
            
        
    }
}
