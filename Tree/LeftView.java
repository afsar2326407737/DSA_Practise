import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Sample tree construction
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right.right.right = new Node(9);
        tree.root.right.right.right.right = new Node(10);

        System.out.println("Left view of the binary tree:");
        tree.leftView();
    }

    // Function to print the left view of the binary tree using iterative method
    void leftView() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for ( int i = 1 ; i <= size ; i++ ){
                Node node = queue.remove();
                if ( i == 1 ){
                    System.out.print(node.data + "--> ");
                }
                if ( node.left != null ){
                    queue.add(node.left);
                }
                if ( node.right != null ){
                    queue.add(node.right);
                }
            }
    
        }
    }
}

// Class representing a node in a binary tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

//info: Solve Leet code 404
