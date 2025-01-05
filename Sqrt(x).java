/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
  
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:
0 <= x <= 231 - 1*/


public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; // The square root of 0 is 0, and the square root of 1 is 1.
        }

        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow
            long midSquared = (long) mid * mid; // Use long to avoid overflow

            if (midSquared == x) {
                return mid; // Found the exact square root
            } else if (midSquared < x) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return right; // right is the largest integer whose square is <= x
    }
}
