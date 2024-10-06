class lastOccurance{
    public static void main(String[] args){
        int []arr = {1,2,3,4,2,5};
        int index = arr.length-1;
        int target = 2;
        System.out.println(occurance(arr,target,index));

    }
    public static int occurance(int[] arr, int target , int index ){
        if ( index == -1){
            return -1;
        }
        if( arr[index] == target ){
            return index;
        }
        int res = occurance(arr , target , index-1);
        return res;
    }
    
}