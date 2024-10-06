class Singlechild{
    public static void main(String[] args){
        
        Singlechild single = new Singlechild();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);

        single.onechild(root1);
    }

    public void onechild(TreeNode root){
        if (root==null ){
            return;
        }
        if ( root.left != null && root.right == null ){
            System.out.print(root.val);
        }
        if ( root.right != null && root.left == null ){
            System.out.print(root.val);
        }
        onechild(root.left);
        onechild(root.right);
        
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