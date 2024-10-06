

public class isbalanced {

    public boolean isBalanced(TreeNode root) {
        // Call the helper function to check if the tree is balanced
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
           if(node==null)
           {
            return 0;
           }
           int left= checkHeight(node.left);
           int right= checkHeight(node.right);
           if(left==-1)
           {
            return -1;
           }
           if(right==-1)
           {
            return -1;
           }

           if(Math.abs(left-right)>1)
           {
              return -1;
           }
           return Math.max(left,right)+1;
    }


    public static void main(String[] args) {
        isbalanced solution = new isbalanced();

        // Manually create a test binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.print(solution.checkHeight(root));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
