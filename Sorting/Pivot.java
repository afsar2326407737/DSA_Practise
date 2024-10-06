class Pivot{
    public static void main( String[] args){
        int[] arr = {1,7,6,5,4};
        int pivot = 4;
        int i = 0 ;
        int j = 0 ;
        while ( j < arr.length ){
            if ( arr[j] <= pivot ){
                swap(arr,i,j);
                i++;
                j++;
            }
            else {
                j++;
            }
            
        }
        for( int k = 0 ; k < arr.length ; k++ ){
            System.out.println(arr[k]);
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}