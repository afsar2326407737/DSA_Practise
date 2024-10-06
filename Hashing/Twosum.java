import java.util.*;

class Twosum{
    public static void main( String[] args ){
        int[] arr = { 6 , 3, 5 ,9 ,6 ,4 };
        HashMap<Integer , Integer> hs =new HashMap<>();
        int target = 10;
        for ( int i = 0 ; i < arr.length ; i++ ){
            hs.put(arr[i],i);
        }
        for ( int j = 0 ; j < arr.length ; j++ ){
            int temp = target - arr[j];
            if( hs.containsValue(temp) && hs.get(temp) != j){
                int firstindex = j;
                int secondIndex = hs.get(temp);
                System.out.print("Indices -->"  + firstindex + " " + secondIndex );
                break;
            }
        }
    }
}