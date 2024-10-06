public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        //stack.pust(60);
        System.out.println("The Peak Element is :"+stack.peek()); 
        System.out.println("The pop ELement is :"+stack.pop());  
        System.out.println("The pop Element is :"+stack.pop());  
        System.out.println("The pop Element is :"+stack.pop()); 
        stack.printall(); 
    }
}

class Stack {
    int []arr;
    int size;
    int top;
    Stack(int size)
    {
        this.size = size;
        arr=  new int[size];
        top=-1;
    }

  public void push(int data)
  {
    if( top == size-1 ){
        System.out.println("Over flow in the  stack");
        return;
    }
    top++;
    arr[top] = data;
  }

  public int pop()
  {
    if ( top == -1 ){
        System.out.println("The stack is in the under flow");
    }
    int popedelement = arr[top];
    arr[top] = 0;
    top--;
    return popedelement;
  }
 public int peek()
 {
    if( top == -1 ){
        System.out.println("The Stack is in the under flow");
        return -1;
    }
    return arr[top];
 }

 public void printall(){
    int temp = top;
    if ( temp == -1 ){
        System.out.print("The stack is empty");
    }
    while( temp != -1 ){
        System.out.println("The remaining element in the stack are :" + arr[temp]);
        temp--;
    }
 }

}

