import java.util.*;



public class BinaryTreeHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Sum of nodes (Recursive): " + sumOfNodes(root));        // Output: 15
        System.out.println("Height of the binary tree (Recursive): " + heightOfBinaryTree(root)); // Output: 2
        BinaryTreeHeight.leaf(root);
        System.out.println("this is maximum element"+BinaryTreeHeight.maxelement(root));
    }
    
    public static int sumOfNodes(TreeNode root) {
        if ( root == null ){
            return 0;
        }
        int l = sumOfNodes(root.left);
        int r = sumOfNodes(root.right);
        int total = l+r+root.val;
        return total;
    }

    public static void leaf( TreeNode root ){
        if(root==null){
            return;
        }
        else if( root.left == null && root.right == null ){
            System.out.print("-->" + root.val);
        }
        else {
            leaf(root.left);
            leaf(root.right);
        }
    }

    public static int maxelement( TreeNode root ){
        if( root == null ){
            return 0;
        }
        int l = maxelement(root.left);
        int r = maxelement(root.right);
        return  Math.max(root.val , Math.max(l,r)); 
    }

    public static int heightOfBinaryTree(TreeNode root) {
          if(root==null)
          {
            return 0;
          } 

         int left= heightOfBinaryTree(root.left);
         int right= heightOfBinaryTree(root.right);
         int height= Math.max(left,right)+1;
         return height;
    }

    
}
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

//info: solve leetcode 112