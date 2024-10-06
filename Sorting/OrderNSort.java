class OrderNSort{
    public static void main( String[] args){
        int [] arr = { 0 ,1 , 1, 0, 1 , 0 , 0 , 0 , 0 };
        int i = 0;
        int j = arr.length -1 ;
        while ( i < j ){
            if( arr[i] == 0){
                i++;
            } 
            else if ( arr[j] == 1){
                j--;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }            
        } 
        //info: print the array
        for ( int k = 0 ; k < arr.length ; k++ ){
            System.out.print(arr[k]);
        }

    }
}


//hack: one solution is to count the number of Zeros and number of Ones in the array using one for loop then . Run the first loop till the count of Zero and run the next loop till the count of the one insert the element occordingly .
//idea: in the above methord there is 3 for loop is used and the time complexity is order of n -->
