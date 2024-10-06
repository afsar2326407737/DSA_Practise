class LongestIncreasingSubArray{
    public static void main(String[] args){
        int []nums = {1,3,5,4,7};
        int maxsum = 1;
        int left = 0;
        int seq = 1;
        for( int i = 1 ; i <  nums.length ; i++ ){
            if ( nums[i-1] < nums[i] ){
                seq++;
                maxsum = Math.max(seq,maxsum);
            }
            else {
                seq = 1;
            }
        }
        System.out.println(maxsum);
    }
    
}
