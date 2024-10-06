import java.util.*;

class Day_1 {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> outli = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> inli = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    inli.add(1);
                } else {
                    int sum = outli.get(i - 1).get(j - 1) + outli.get(i - 1).get(j);
                    inli.add(sum);
                }
            }
            outli.add(inli);
            // print statement 
            

        }
        
        for (List<Integer> innerList : outli) {
            System.out.println(innerList);
        }
    }
}
