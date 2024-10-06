

public class LowestCommonAncestor {
    public static void main(String[] args) {
        // Example tree and nodes
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        int p = 5;
        int q = 1;
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + lca.val);
    }
    
    static TreeNode LCA = null;
    // Depth First Search function to find the Lowest Common Ancestor
    public static boolean LCA_DFS(TreeNode node, int p, int q) {
       if(node==null)
       {
         return false;
       }
       boolean self= node.val==p || node.val==q;
       boolean left=     LCA_DFS(node.left,p,q);
       boolean right=     LCA_DFS(node.right, p,q);
       if(left&&right || self&&right || self&&left)
       {
        LCA=node;
       }
       return left||right||self;
    }

    // Function to find the Lowest Common Ancestor
    public static TreeNode lowestCommonAncestor(TreeNode node, int p, int q) {
        LCA_DFS(node, p, q);
        return LCA;
    }
    // Utility function to display a tree (example method)
    public static void display(TreeNode node) {
        // Code for displaying tree can go here
        if (node != null) {
            display(node.left);
            System.out.print(node.val + " ");
            display(node.right);
        }
    }
    
}
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}

//info: solve leetcode 236