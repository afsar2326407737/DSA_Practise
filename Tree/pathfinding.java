import  java.util.*;

class pathfinding{

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> list = new ArrayList<>();
        pathfinding.findpath( root , list , 3 );
        System.out.print(list);
    
    }

    public static boolean findpath(TreeNode root , List<Integer> path , int target ){
        if ( root == null ){
            return false;
        } 
        path.add(root.val);
        if( root.val == target ){
            return true;
        }
        boolean left = findpath(root.left , path , target);
        if ( left ){
            return true;
        }
        boolean right = findpath(root.right , path ,  target);
        if ( right ){
            return true;
        }

        path.remove(path.size()-1);
        return false;

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

//info: Solve leetcode 257 Binary Tree Path 
