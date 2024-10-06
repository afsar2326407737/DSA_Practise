public class opration{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //list.add(60);
        System.out.println("Initial list:");
        // list.printList();
        //list.reverse();
        //list.rearrangeEvenOdd();
        //list.zero();
        list.printList();
        System.out.print(list.hasCycle());
        // list.serch(30);
        // list.mid();
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

    //note: Add a new node at the end of the list
    public void add(int data) {

        Node newNode= new Node(data);

        if(head==null)
        {
            head= newNode;
        }
        else{
        Node current = head;

        while(current.next!=null)
        {
            current=current.next;
        }

        current.next=newNode;
    }
    }


    //note:delete the specific node
    public void delete( int data ){
        if ( head == null ){
            System.out.print("List is Empty");
            return;
        }
        else if ( head.data == data ) {
            head = head.next;
            return;
        }

        else {
            Node previous = null;
            Node current = head;
            while ( current != null && current.data != data){
                previous = current;
                current = current.next;
            }

            if ( current != null ){
                previous.next = current.next;
            }
            else{
                System.out.println("There is No Nosde for this data");
            }
        }
    }

    //note: serch node 

    public void serch( int data ){
        if ( head == null ){
            System.out.println("The List is Empty");
        }
        
        else {
            Node current = head;
            while ( current.next != null ){
                if ( current.data == data ){
                    System.out.print("The data is found");
                    break;
                }
                current = current.next;
            }
            if ( current.next == null ){
            System.out.print("No such data found");
            }
        }
        
        
        return;
    }

    //note: Print the linked list
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


    //note: reverse the node
    public void reverse(){
        if ( head == null ){
            System.out.print("The List is Empty");
            return;
        }

        Node previos = null;
        Node current = head;
        Node next = current.next;
        while(current.next != null ){
            next = current.next;
            current.next = previos;
            previos = current;
            current = next;
        }
        head = previos;
        
    }

    //note: find the mid of the linked list 
    public void mid(){
        if ( head == null ){
            System.out.print("The list is Empty");
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print("The Mid Element is -->" + slow.data);
    }


    //note:re arrange the node 

    //fixme: Need to study the concept 

    public void rearrangeEvenOdd(){
        if ( head == null || head.next == null ){
            System.out.print("No data");
            return;
        }

        Node odd = head;
        Node even = head.next;
        Node even_head = even;

        while( even != null && even.next != null ){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = even_head;
    }


    public void zero(){
        System.out.print("Hello");
        Node current = head;
        int zero_count = 0;
        int one_count = 0;

        while( current != null ){
            if ( current.data == 0 ){
                zero_count++;
            }
            else {
                one_count++;
            }
            current = current.next;
        }
        current=head;

        while (current != null){
            if ( zero_count > 0 ){
                current.data = 0;
                zero_count--;
            }
            else {
                current.data = 1;
                one_count--;
            }
            current = current.next;
        }

    }

    //info: hascycle or not 
    public boolean hasCycle(){
        if ( head == null || head.next == null ){
            return false;
        }
        Node slow = head;
        Node fast = head;


        while ( fast != null && fast.next != null ){
            if( fast == slow ){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;

            
        }
        return false;
    }
    
}


