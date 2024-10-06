class BitManupulation{
    public static void main(String[] args) {
        int n = 15;
       System.out.println(countSetBit(n));
        
    }
    private static int countSetBit ( int n){
    int  count = 0 ;
    while ( n != 0 ){
        count = count  + (n & 1);
        n = n >> 1 ;
    }
    return count ;
}
}



