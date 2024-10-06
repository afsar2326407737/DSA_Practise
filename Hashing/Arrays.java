import java.util.*;

class Arrays{
    public static void main( String[] args ){
        int[] arr = {1 ,2, 3, 4,5};
        int[] brr = {1,2,3,5,6};
        findMissingNumber(arr,brr);
    }

    public static List<Integer> findMissingNumber(int[] arr , int[] brr){
        HashMap<Integer , Integer> freqArr = new HashMap<>();
        HashMap<Integer , Integer> freqBrr = new HashMap<>();
        for ( int num : arr ){
            freqArr.put(num , freqArr.getOrDefault(num , 0) + 1);
        }
        for ( int num : brr ){
            freqBrr.put(num , freqBrr.getOrDefault( num , 0 )+ 1);
        }

        List<Integer> missingNumber = new ArrayList<>();
        for ( int num : freqBrr.keySet() ){
            if ( !freqArr.containsKey(num) || freqArr.get(num) < freqBrr.get(num)){
                missingNumber.add(num);
            }
        }
        Collection.sort(missingNumber);
        return missingNumber;
    }
}