import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      int[] arr = {10,5,9,1,11,8,6,15,3,12,2};     
      HashMap<Integer, Boolean> map = new HashMap<>();
      for (int val : arr) {
         map.put(val, true);
      }
      for (int val : arr) {
         if (map.containsKey(val - 1)) {
            map.put(val, false);
         }
      }
      int msp = 0;
      int ml = 0;
      for (int val : arr) {
         if(map.get(val) == true){
            int tsp = val;
            int tl = 1;

            while(map.containsKey(tsp + tl)){
               tl++;
            }

            if(tl > ml){
               ml = tl;
               msp = tsp;
            }
         }
      }
      for(int i = 0; i < ml; i++){
         System.out.println(msp + i);
      }
   }

}