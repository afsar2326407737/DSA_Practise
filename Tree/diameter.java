class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DiameterTree {
    private int maxDiameter = 0;  // Variable to store the maximum diameter

    // Function to calculate the diameter of the binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  // Calculate the height of the tree while updating the diameter
        return maxDiameter;  // Return the maximum diameter found
    }

    // Helper function to calculate the height of the tree
    private int height(TreeNode node) {
        int left = height(node.left);
        int right = height(node.right);
        maxDiameter = Math.max(maxDiameter , left+right);
        return Math.max(left,right)+1;

    }

    public static void main(String[] args) {
        // Example to test the diameter function
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterTree tree = new DiameterTree();
        System.out.println("The diameter of the tree is: " + tree.diameterOfBinaryTree(root));
    }
}
