class FirstOccurance{
    public static void main(String[] args){
        int []arr = {1,3,4,2,5};
        int index = 0;
        int target = 2;
        System.out.println(occurance(arr,target,index));

    }
    public static int occurance(int[] arr, int target , int index ){
        if ( index == arr.length){
            return -1;
        }
        if( arr[index] == target ){
            return index;
        }
        int res = occurance(arr , target , index+1);
        System.out.println(res);
        return res;
    }
}