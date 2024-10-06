import java.util.*;

class stocks{
    public static void main( String[] args ){
        int[] prices = {100,80,60,70,60,75,85};
        int[] result = calculateSpan(prices);
        System.out.println("Span values: " + Arrays.toString(result));
    }

    public static int[] calculateSpan(int[] prices ){
        int n = prices.length;

        int span[] = new int[n];
        Stack<Integer> s = new Stack<Integer>();

        for ( int i = 0 ; i < n ; i++ ){
            while(!s.empty() && prices[s.peek()] <= prices[i] ){
                s.pop();
            }
            if(s.empty()){
                span[i] = i;
            }
            else {
                span[i] = i - s.peek();
            }

            s.push(i);
        }
        return span;
    }
}