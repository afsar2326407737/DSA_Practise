class Steps{
    public static void main(String[] args) {
        int n = 5 ;
        Staircase(n,0,"");
    }

    public static void Staircase( int n , int steps  , String path ){
        if ( steps > n ){
            return ;
        }
        if ( steps == n ) {
            System.out.println(pasth);
            return;
        } 
        Staircase( n ,  steps + 1 , path + "1");
        Staircase ( n , steps + 2 , path + "2");
        
    }
}