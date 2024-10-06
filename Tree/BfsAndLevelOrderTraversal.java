import java.util.*;



public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);

        while (!mq.isEmpty()){
            int size = mq.size();
            List<Integer> res = new ArrayList<>();
            for ( int i = 1 ; i <= size ; i++ ){
                TreeNode node = mq.remove();
                res.add(node.val);
                if ( node.left != null ){
                    mq.add(node.left);
                }
                if ( node.right != null ){
                    mq.add(node.right);
                }
            }
            result.add(res);
        }
        return result;
    }

    // Helper method to print the result
    public void printLevelOrder(List<List<Integer>> levels) {
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }

    // Main method for testingm
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

        // Manually create a test binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Get level order traversal result
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        solution.printLevelOrder(result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


//info: Solve Leetcode 515 , 637 , 1161 , 103 
