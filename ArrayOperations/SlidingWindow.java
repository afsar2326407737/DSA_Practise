import java.util.*;


class SlidingWindow{
    public static void main(String[] args){
        test t = new test();
        t.tergetsum();
        
    }

    class test{
        public void maximumSubArray(){
            int key = 100;
            int left = 0;
            int product = 1;
            int count = 0;

            for ( int right = 0 ; right < arr.length ; right++ ){
                product = product*arr[right];

                while( product >= key ){
                    product = product / arr[left];
                    left++;
                }

                count = count + right - left + 1;
            }
            System.out.print(count);
        }

        public int tergetsum(){
            int arr[] = {9,3,5,6,7,8};
            Arrays.sort(arr);

            int target = 7;
            int left = 0;
            int right = arr.length;
            while ( left < right ){
                int sum = arr[left] + arr[right];
                if( sum == target ){
                    return new int[]{left , right};
                } 
                else if( sum > target ){
                    left--;
                }
                else{
                    right++;
                }
            }
        }
    }
}
