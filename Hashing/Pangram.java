import java.util.*;

class Pangram {
    public static void main(String[] args) {
        String sentance = "abc defghjklmnop qrstuvwxyz";
        System.out.print( isPangram(sentance));
        
    }

    public static boolean isPangram( String sentance){
        HashSet<Character> letter = new HashSet<>();

        sentance = sentance.toLowerCase();
        for ( int i = 0 ; i < sentance.length() ; i++ ){
            char c = sentance.charAt(i);
            if ( c >= 'a' && c <= 'z' ){
                letter.add(c);
            } 
        }
        return letter.size() == 26;
    }
    
}