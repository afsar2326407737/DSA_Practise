// Definition for a binary tree node.


public class MirrorTree {

    // Method to check if two trees are the same
    public boolean printmirror(TreeNode p, TreeNode q) {
        if (p==null && q==null )
        { 
            return true;
        }

        if (p==null || q==null ){
            return false;
        }

        if ( p.val == q.val ){
            return true;
        }

        boolean res1 = printmirror(p.left , q.right);
        boolean res2 = printmirror( p.right , q.left );

        return res1 && res2;
        
    }

    public static void main(String[] args) {
        MirrorTree checker = new MirrorTree();

        // Creating first tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        boolean result = checker.printmirror(root1, root2);

        // Output the result
        if (result) {
            System.out.println("Mirrored");
        } else {
            System.out.println("Not Mirrored");
        }
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


//info: solve leetcode 101



