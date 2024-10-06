import java.util.LinkedList;
import java.util.Queue;

//idea: neet to dry run the code

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class DeepestLeavesSum {

    public static void main(String[] args) {
        // Example binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        int result = solution.deepestLeavesSum(root);
        System.out.println("Deepest leaves sum: " + result);
    }


    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0; // If the tree is empty, return 0
        }
        // Initialize a queue for level-order traversal (BFS)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int deepest_sum=0;
        while(!queue.isEmpty())
        {
            deepest_sum=0;
            int count= queue.size();
            for(int i=1;i<=count;i++){
                TreeNode node= queue.remove();
                deepest_sum=deepest_sum+node.val;
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
        }
        return deepest_sum;
    }
    
}

//info: leetcode sum 515 deep leaves sum 