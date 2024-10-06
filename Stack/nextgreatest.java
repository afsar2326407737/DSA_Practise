import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    //info: next greater element in the right
   public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int n= arr.length;
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.empty() && stack.peek()<=arr[i])
            {
                stack.pop();
            }

            if(stack.empty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3,9,11,13,2,4,6,5};
        int[] result = nextGreaterLeft(arr);
        System.out.println(Arrays.toString(result));
    }


    //info: next greater element in the left
    public static int[] nextGreaterLeft( int [] arr ){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int n= arr.length;
        for(int i = 0 ; i < n ; i++ )
        {
            while(!stack.empty() && stack.peek()<=arr[i])
            {
                stack.pop();
            }

            if(stack.empty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;

    }

    //info: next smaller elent in the left
    public static int[] nextsmallerleft( int [] arr ){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int n= arr.length;
        for(int i = 0 ; i < n ; i++ )
        {
            while(!stack.empty() && stack.peek()>=arr[i])
            {
                stack.pop();
            }

            if(stack.empty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;

    }

    //info: next smaller element in the right

    public static int[] nextsmallerright( int [] arr ){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int n= arr.length;
        for(int i = n-1; i >=0 ; i-- )
        {
            while(!stack.empty() && stack.peek()>=arr[i])
            {
                stack.pop();
            }

            if(stack.empty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
