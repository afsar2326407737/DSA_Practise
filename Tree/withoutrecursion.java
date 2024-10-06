import java.util.*;  // Importing required classes


//info: traversal without using the recursion 

public class Solution {
    // Main method to run the code
    public static void main(String[] args) {
        // Example: Create a sample tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        List<Integer> preorder = solution.preorderTraversal(root);

        // Print the result of preorder traversal
        System.out.println("Preorder Traversal: " + preorder);

        System.out.print(solution.heighttree(root));
    }

    //info: creation of the node array   
   public static class Pair {
     TreeNode data;
     int state;
     Pair(TreeNode data, int state) {
         this.data = data;
         this.state = state;
     }
    }

    //info: preorder traversal
    public List<Integer> preorderTraversal(TreeNode root) {
      
      List<Integer> result = new ArrayList<>();
      Stack<Pair> stack = new Stack<>();
       
       stack.push(new Pair(root,0));
       
       while(!stack.isEmpty())
       {
        Pair top = stack.peek();
        if(top.state==0)
        {
            result.add(top.data.val);
            top.state++;
            if(top.data.left!=null)
            {
                stack.push(new Pair(top.data.left,0));
            }
        }
        else if(top.state==1)
        {
            top.state++;
            if(top.data.right!=null)
            {
                stack.push(new Pair(top.data.right,0));
            }
        }
        else
        {
            stack.pop();
        }
       }
       return result;
    }

    //info: finding the height of the tree 
    public int heighttree(TreeNode root ){
        if ( root == null ){
            return 0;
        }

        int left = heighttree(root.left);
        int right = heighttree(root.right);
        int height = Math.max(left ,right)+1;
        return height;
    }

    
}

//note: constructor for the tree
class TreeNode {
    int val;
    TreeNode left, right;
    // Constructors
    TreeNode() {}
    TreeNode(int val) {
         this.val = val; 
         }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
