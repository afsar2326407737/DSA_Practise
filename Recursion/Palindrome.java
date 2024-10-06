class Palindrome{
    public static void main( String[] args){
        String s   = "madandam";
        int ind = 0;
        int end =  s.length()-1;
        if( pali(s,ind,end) ){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
    public static boolean pali(String s , int ind , int end){
        if ( ind >= end ){
            return true;
        }
        if ( s.charAt(ind) != s.charAt(end)){
            return false;
        }
        boolean res = pali(s , ind + 1 , end -1 );
        return res;
    }
}