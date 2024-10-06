package Recursion;

class MaxElement{
    public static void main(String[] args) {
        int []arr = {1,2,3};
        int index = 0;
        System.out.println(maximum(arr,index));


    }
    public static int maximum(int [] arr , int index ){
        if ( index <= arr.length-1 ){
            return arr[index];
        }
        int val = maximum(arr,index+1);
        if ( val > arr[index]){
            return val;
        }
        else {
            return arr[index];
        }
    }
    
}