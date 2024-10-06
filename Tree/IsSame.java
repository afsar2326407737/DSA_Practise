// Definition for a binary tree node.


public class SameTreeChecker {

    

    public static void main(String[] args) {
        SameTreeChecker checker = new SameTreeChecker();

        // Creating first tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        // Creating second tree (identical to the first tree)
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        // Checking if both trees are the same
        boolean result = checker.isSameTree(root1, root2);

        // Output the result
        if (result) {
            System.out.println("Both trees are the same.");
        } else {
            System.out.println("The trees are not the same.");
        }
    }

    // Method to check if two trees are the same
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q ==null){
            return true;
        } 
        else if(p == null || q == null ){
            return false;
        }
        if(p.val == q.val ){
            return true;
        }

        boolean res1 = isSameTree(p.left , q.left);
        boolean res2 = isSameTree(p.right , q.right);
        
        return res1&&res2;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
