import java.util.*;



public class BinaryTreeTraversal {
    // Preorder traversal: Root -> Left -> Right
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = new ArrayList<>();
        postorderRecursion(root, result);
        System.out.println(result);  // Output: [1, 2, 4, 5, 3]
    }


    public static void preorderRecursive(TreeNode root, List<Integer> result) {
        if(root==null)
        {
            return;
        }
        result.add(root.value);
        preorderRecursive(root.left, result);
        preorderRecursive(root.right, result);
    }

    public static void inorderRecursive(TreeNode root, List<Integer> result) {
        if ( root == null ){
            return;
        }
        inorderRecursive(root.left , result );
        result.add(root.value);
        inorderRecursive(root.right , result );
    }

    public static void postorderRecursion(TreeNode root , List<Integer> result ){
        if ( root == null ){
            return;
        }

        postorderRecursion(root.left , result);
        postorderRecursion(root.right , result);
        result.add(root.value); 
    }

    
    // Inorder traversal: Left -> Root -> Right
}

class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}
//info: basics of the tree
// https://leetcode.com/problems/binary-tree-preorder-traversal/description/
//https://leetcode.com/problems/binary-tree-inorder-traversal/description/
//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
