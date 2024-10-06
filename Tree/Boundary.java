import java.util.ArrayList;
import java.util.List;



public class BoundaryTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        BoundaryTraversal tree = new BoundaryTraversal();
        List<Integer> boundary = tree.boundaryTraversal(root);
        System.out.println("Boundary Traversal: " + boundary);
    }

    // Helper method to check if a node is a leaf node
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    // Method to add the left boundary (excluding leaves)
    private void addLeftBoundary(Node node, List<Integer> result) {
        Node current = node.left;
        while (current != null) {
            if (!isLeaf(current)) {
                result.add(current.data);
            }
            current = (current.left != null) ? current.left : current.right;
        }
    }

    // Method to add the right boundary (excluding leaves) in reverse order
    private void addRightBoundary(Node node, List<Integer> result) {
        List<Integer> temp = new ArrayList<>();
        Node current = node.right;
        while (current != null) {
            if (!isLeaf(current)) {
                temp.add(current.data);
            }
            current = (current.right != null) ? current.right : current.left;
        }
        // Reverse and add to result
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }

    // Method to add the leaf nodes
    private void addLeaves(Node node, List<Integer> result) {

        if(node==null)
        {
            return ;
        }

        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }

            addLeaves(node.left, result);
            addLeaves(node.right, result);

    }

    // Main boundary traversal method
    public List<Integer> boundaryTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Add root (only if it's not a leaf node)
        if (!isLeaf(root)) {
            result.add(root.data);
        }

        // Add left boundary
        addLeftBoundary(root, result);

        // Add all leaf nodes
        addLeaves(root, result);

        // Add right boundary
        addRightBoundary(root, result);

        return result;
    }

    
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

//info: solve Boundary Traversal in geeksforgeeks.org