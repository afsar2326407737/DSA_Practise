package Recursion;

class Index_Rec{
    public static void main (String[] args){
        int []arr = {1,2,3,4,5,6};
        int index = 0;
        Arraysindex(arr,index);
        System.out.println("Hello");

    }
    public static void  Arraysindex( int []arr , int index ){
        if ( index == arr.length ){
            return;
        }
        Arraysindex(arr , index+1);
        System.out.println(arr[index]);

    }
}