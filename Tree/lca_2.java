import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class lca_2 {

    // Recursive function to find the path from root to the given node
    public static boolean findPath(TreeNode root, List<Integer> path, int target) {
        // Base case
        if (root == null) {
            return false;
        }

        // Add the current node to the path
        path.add(root.data);

        // Check if the current node is the target node
        if (root.data == target) {
            return true;
        }

        // Recursively check in the left and right subtrees
        if (root.left != null && findPath(root.left, path, target)) {
            return true;
        }
        if (root.right != null && findPath(root.right, path, target)) {
            return true;
        }

        // If the target node is not found, remove the current node from the path
        path.remove(path.size() - 1);
        return false;
    }

    // Function to find the lowest common ancestor (LCA) of two nodes
    public static int findLCA(TreeNode root, int node1, int node2) {

        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();

        if (!findPath(root,path2,node1) || !findPath(,root , path2 , node2)){
            System.out.print("There is No Path Founded");
            return -1;
        }

        int i = 0;
        while( i < path1.size() && i < path2.size() && path1.get(i).equals(path2.get(i))){
            i++;
        }

        return path1.get(i-1);

    }

    public static void main(String[] args) {
        // Example tree
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int node1 = 4;
        int node2 = 5;

        // Find the LCA of node1 and node2
        int lca = findLCA(root, node1, node2);
        if (lca != -1) {
            System.out.println("LCA of " + node1 + " and " + node2 + " is: " + lca);
        }
    }
}
