class Factorial_Recursion{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));

    }
    public int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * Factorial(n-1);
        }
    }
    
    
}

