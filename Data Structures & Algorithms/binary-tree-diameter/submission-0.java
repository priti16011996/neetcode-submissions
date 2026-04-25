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
    public class Info{
        int D;
        int H;
        Info(int D, int H)
        {
            this.D = D;
            this.H = H;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).D;
    }
    public Info diameter(TreeNode root)
    {
        if(root == null)
        {
            return new Info(0,0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.D,rightInfo.D),leftInfo.H+rightInfo.H);
        int ht = Math.max(leftInfo.H,rightInfo.H)+1;
        return new Info(dia,ht);
    }
}
