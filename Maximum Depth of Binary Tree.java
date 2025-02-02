/* Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
  
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3
  
Example 2:
Input: root = [1,null,2]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100*/


public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: if the tree is empty, its depth is 0.
        }
        
        // Recursively find the depth of the left and right subtrees.
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Return the larger depth + 1 (to include the current node).
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

