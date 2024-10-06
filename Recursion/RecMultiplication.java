class RecMultiplication{
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 5;
        int b = 5;
        System.out.println(multiply(a,b));
    }
    public static int  multiply(int a , int  b) {
        if ( b == 0 ){
            return 0;
        }
        int res = multiply(a , b-1 );
        res = res+a;
        return res;
    }
}