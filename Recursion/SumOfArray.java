class SumOfArray{
    public static void main (String[] args){
        int []arr = { 1 , 2 , 3 , 4 , 5  };
        int ind = 0;
        System.out.println(mul(arr,ind));

    }
    public static int mul( int[]arr , int ind ){
        if ( ind == arr.length -1 ){
            return arr[ind];
        }
        int res = mul(arr,ind+1);
        res = res + arr[ind];
        return res;
        
    }
}