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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
        {
            return false;
        }
        if(root.val == subRoot.val)
        {
            if(isIdentical(root,subRoot))
            {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isIdentical(TreeNode node, TreeNode subNode) {
        if(node == null && subNode == null)
        {
            return true;
        }
        else if(node==null || subNode == null || node.val != subNode.val)
        {
            return false;
        }
        if(!isIdentical(node.left, subNode.left))
        {
            return false;
        }
        if(!isIdentical(node.right,subNode.right))
        {
            return false;
        }
        return true;
    }

}
