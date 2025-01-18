/* Given an integer numRows, return the first numRows of Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case: first row is always [1]
        if (numRows <= 0) {
            return triangle;
        }
        
        // Add the first row
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        // Build the rest of the rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);
            
            // First element of each row is always 1
            row.add(1);
            
            // Compute the intermediate values
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element of each row is always 1
            row.add(1);
            
            // Add the row to the triangle
            triangle.add(row);
        }
        
        return triangle;
    }
}

