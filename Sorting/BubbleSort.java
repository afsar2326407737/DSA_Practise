class BubbleSort{
    public static void main( String[] args ){
        int arr[] = {1,4,2,5,3};
        int leng = arr.length;
        BubbleSort( arr , leng );

        //info: for display the array in the output
        for ( int i = 0 ; i < leng ; i++){
            System.out.print(arr[i]);
        }
    }

    public static void BubbleSort(int[] arr , int leng){
        for ( int i = 0 ; i < leng-1 ; i++ ){
            for ( int j = 1  ; j < leng-i ; j++ ){
                if ( arr[j-1] >= arr[j] ){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    
}
  