class InsertionSort{
    public static void main(String[] args){
        int [] arr = {5,4,2,3,1};
        insertsort(arr);
        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]);
        }
    }
    public static void insertsort(int [] arr ){
        for ( int i = 1 ; i < arr.length ; i++ ){
            for ( int j = i ; j > 0 ; j--){
                if (isSmall(arr, j , j-1)){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
        
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
    public static boolean isSmall(int[] arr, int a, int b) {
        return arr[a] < arr[b];
    }
}