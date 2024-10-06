

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a valid BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);

        // Validate if the tree is a valid BST
        if (solution.isValidBST(root)) {
            System.out.println("The tree is a valid Binary Search Tree.");
        } else {
            System.out.println("The tree is NOT a valid Binary Search Tree.");
        }

        // Create an invalid BST
        TreeNode invalidRoot = new TreeNode(5);
        invalidRoot.left = new TreeNode(3);
        invalidRoot.right = new TreeNode(8);
        invalidRoot.left.left = new TreeNode(2);
        invalidRoot.left.right = new TreeNode(6);  // This makes it invalid

        // Validate if the tree is a valid BST
        if (solution.isValidBST(invalidRoot)) {
            System.out.println("The tree is a valid Binary Search Tree.");
        } else {
            System.out.println("The tree is NOT a valid Binary Search Tree.");
        }
    }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
       return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    
}public boolean isValidBST(TreeNode root,long minval,long maxval){
    if(root==null) return true;
    if(root.val>=maxval || root.val<=minval) return false;
    return isValidBST(root.left,minval,root.val) && isValidBST(root.right,root.val,maxval);
}}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//info: solve Leetcode 98