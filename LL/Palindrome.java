

public class palindromk {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        // Print the linked list
        System.out.println("Linked List:");
        list.printList();

        // Check if the linked list is a palindrome
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome() {
       if(head==null)
       {
        return false;
       }
       if(head.next==null)
       {
        return true;
       }
        Node slow= head;
        Node fast= head;
        while(slow.next!=null && slow.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
         Node second_half = reverseList(slow);
         Node first_half= head;
         while(second_half!=null)
         {
            if(first_half.data!=second_half.data)
            {
               return false;
            }
            first_half=first_half.next;
            second_half=second_half.next;
         }
         return true;
    }

    // Helper function to reverse a linked list
    private Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

