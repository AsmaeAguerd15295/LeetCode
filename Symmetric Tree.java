/*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true
  
Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 
  Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // A tree is symmetric if its left and right subtrees are mirrors.
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true; // Both nodes are null
        if (t1 == null || t2 == null) return false; // One node is null
        if (t1.val != t2.val) return false; // Node values are different

        // Recursively check if left subtree of t1 is a mirror of right subtree of t2
        // and right subtree of t1 is a mirror of left subtree of t2
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}

 
