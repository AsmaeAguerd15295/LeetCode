/*Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [3,2,1]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,6,7,5,2,9,8,3,1]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 

Constraints:

The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?*/


//Recursive
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorder(node.left, result);   // Traverse left subtree
        postorder(node.right, result);  // Traverse right subtree
        result.add(node.val);           // Visit the root
    }
}


//Iterative
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (!stack.isEmpty() || root != null) {
            // Traverse to the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // Peek the node at the top of the stack
            root = stack.peek();

            // If the right child is null or already processed, visit the node
            if (root.right == null || root.right == prev) {
                result.add(root.val); // Visit the root
                stack.pop();           // Remove the node
                prev = root;           // Mark the node as processed
                root = null;           // Set root to null to continue processing the stack
            } else {
                // Otherwise, move to the right child
                root = root.right;
            }
        }

        return result;
    }
}
