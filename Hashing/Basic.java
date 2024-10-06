import java.util.*;

class Basic{
    public static void main(String [] args ){
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put("Afsar",1);
        // map.put("Hello",2);
        

        // System.out.print(map.containsKey("Aasd"));

        int[] arr = {1,1,1,2,2,2,3,3};
        int max = 0;
        for ( int i = 0 ; i < arr.length ; i++ ){
            if( map.containsKey(arr[i])){
                map.put( arr[i] , map.get(arr[i])+1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }
        for ( Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.print("The Value is : " + map.get(3));
    }
}