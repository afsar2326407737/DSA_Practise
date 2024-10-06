import java.util.*;



class MaxelementInLevel{
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

        MaxelementInLevel solution = new MaxelementInLevel();
        List<Integer> largestValues = solution.largestValues(root);
        System.out.println("Largest values in each tree row: " + largestValues);

        
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result; // Return empty list if the tree is empty
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Start with the root node
        while (!queue.isEmpty()) {
            int max= 0;
            int size = queue.size(); // Get the number of nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove(); // Remove the front node from the queue
                max=  Math.max(max,currentNode.val);
                // Add left and right children to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(max);
        }

        return result; // Return the list of maximum values in each row
    }


}

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