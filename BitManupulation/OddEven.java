class BitManupulation{
    public static void main(String[] args) {
        int a = 10;
        if ( (a & 1) == 0 ){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}