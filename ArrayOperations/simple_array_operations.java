import java.security.PublicKey;
import java.util.*;


// public class  hello extends prack {
//         public void details ( String name , String address , int age){
//             System.out.println("Hello I am " + name);
//             System.out.println("My adress are " + address);
//             System.out.println("My age is " + age);
//         }
// }




// class prack{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the name :");
//         String name = s.nextLine();
//         System.out.print("Enter the address :");
//         String address = s.nextLine();
//         System.out.print("Enter the age :");
//         int age = s.nextInt();
//         hello h = new hello();
//         h.details(name, address, age);
//         s.close();
//     }
// }



class hello {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the size of Array :");
        // int size = scn.nextInt();
        // //int [] arr = new int[size];

        // int[][] tdarr = new int[size][size]; 
        // // input getting of the array

        // // for ( int i = 0 ; i < size ; i++ ){
        // //     arr[i] = scn.nextInt();
        // // }
        

        // for ( int i = 0 ; i < tdarr.length ; i++ ){
        //     for ( int j = 0 ; j < tdarr[0].length ; j++ ){
        //         tdarr[i][j] = scn.nextInt();
        //     }
        // }
         ArrayOperations ao = new ArrayOperations();
         ArraySums as = new ArraySums();
    //    // ao.palindrom(arr, size);
    //    // ao.swaping(arr, size);
    //     //ao.findthemaxmin(arr, size);
    //     ao.findTheMissingElement(arr, size);

    //     // output printing 
    //     for ( int i = 0 ; i < size ; i++ ){
    //         System.out.print(arr[i] + " ");
    //     }


    //pattern printing sums
    //ao.StarPattern(size);
    //ao.ReverseStar(size);
    //ao.FindingTheSecondElement(arr, size);
    //ao.duplicate(arr);

    // ao.TwoDimentionlArray(tdarr);
    // ao.DiagonalAdding(tdarr);
    //ao.TraversaiSnake(tdarr);
    //ao.Traversal(tdarr);

    //Note: array sums class declaration
    //as.PreFixSum();
    //as.queris();

    as.subArrayOddLength();
    
    scn.close();


    }
}
class ArrayOperations{
    public void palindrom(int arr[] , int size){
        int i = 0;
        int j = size-1;
        int count = 0;
        while (i < j) {
            if(arr[i] == arr[j] ){
                i++;
                j--;
                count += 1;
                continue;
            }
            else {
                break;
            }
        }
        if (count != 0){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }

    public void swaping( int arr[] , int size){
        int f=0;
        int l = size-1;
        while( f < l ){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        System.out.println("the reversing of the string is : ");   //509  -->-->-->-->--> ( ^ _ ^ )  LeetCode Sum
    }


    public void findthemaxmin(int arr[] , int size){
        int minimum = 100;
        int maximum = 0;
        for ( int min = 0 ; min < arr.length ; min++ ){
            if ( minimum > arr[min]){
                minimum = arr[min];
            }
            if ( maximum < arr[min] ){
                maximum = arr[min];
            }
        }
        System.out.println("the minimum element is :" +" "+ minimum + " " + "The maximum is : " + " " + maximum);
        System.out.println("the sum of maximum and minimum is :" + (maximum + minimum));
    }

    public int sumofNnarturalnumbers(int size){
        int ans = size * (size + 1)/2;
        return ans;
    } 
    
    public void findTheMissingElement(int arr[] , int size){
        int sum = 0;
        for ( int i = 0 ; i < size ; i++ ){
            sum += arr[i];
        }
        int ans = sumofNnarturalnumbers(size);
        if ( sum == ans ){
            System.out.println("there is no missing element ");
        }
        else {
            System.out.println("The missing element is -->" + (ans-sum) );
        }

    }
    public void StarPattern(int size){
        for( int i = 1 ; i <= size ; i++){
            
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public void ReverseStar(int size){
        for ( int i = size ; i >= 1 ; i--){
            for ( int j = 1 ; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void FindingTheSecondElement(int arr[] , int size){
        int maximum = -1;
        int secondmaximum = 0;
            for ( int j = 0 ; j < arr.length ; j++ ){
                if ( maximum < arr[j] ){
                    secondmaximum = maximum;
                    maximum = arr[j];
                }
                else if ( arr[j] > secondmaximum && arr[j] != maximum){
                    secondmaximum = arr[j];
                }
            }
            System.out.println  ("The Second largest number is : "+secondmaximum);
    }

    public void duplicate( int [] arr){
        boolean flag = true;
        Arrays.sort(arr);
        System.out.println(arr);

        for ( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] == arr[i-1] ){
                flag = false;
            }
        }
        if ( flag == false ){
            System.out.println("There is a Duplicate Element");
        }
        else {
            System.out.println("There is No Dupluicate");
        }
    }

    public void TwoDimentionlArray( int tdarr[][] ){
        for ( int i = 0 ; i < tdarr.length ; i++ ){
            for ( int j = 0 ; j < tdarr[i].length ; j++ ){
                System.out.print(tdarr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void DiagonalAdding( int tdarr[][]){
       // int count = 0;
        int sum = 0;
        for ( int i = 0 ; i < tdarr.length ; i++ ){
            sum += tdarr[i][i];
            //count++;
        }
        System.out.println("the additon of diagonal is :" + sum);
    }
    
    public void TraversaiSnake( int tdarr[][] ){
        System.out.println("inside");

        boolean flag = false; // This will help alternate the direction
        int i = 0; // Iterator for the columns
        int count = 0; // Iterator for the rows
    
        while (count < tdarr.length) {
            if (!flag) {
                // Print left to right
                for (i = 0; i < tdarr[0].length; i++) {
                    System.out.print(tdarr[count][i] + " ");
                }
            } else {
                // Print right to left
                for (i = tdarr[0].length - 1; i >= 0; i--) {
                    System.out.print(tdarr[count][i] + " ");
                }
            }
            
            count++;
            
            flag = !flag;
            
            System.out.println(); 
        }
    }

    public void Traversal ( int tdarr[][]){
        int row = tdarr.length;
        int col = tdarr.length;

        for ( int i = 0 ; i < row ; i++ ){
            if ( i%2 != 0 ){
                for ( int j = col-1 ; j >= 0 ; j-- ){
                    System.out.print(tdarr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for( int j = 0 ; j < col ; j++){
                    System.out.print(tdarr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //note: printing the matrix in the sprial manner


    public void SpiralMatrix(int tdarr[][]){
        int row = tdarr.length;
        int col = tdarr[0].length;
        int count = 0;
        int last = col;
        for ( int i = 0 ; i < row ; i++ ){
            System.out.print(tdarr[count][i]);
        }
        for( int j = 0 ; j < col ; j++ ){

        }

    }

    //todo: matrix in square manner 
    //idea: important to solve this sum

}


class ArraySums{

    public void PreFixSum(){
        int [] arr = {1,2,3,4,5};
        int [][] sub = new int[5][5];
        int [] arr1 = new int[arr.length];
        int row = arr.length;
        int col = arr.length;

        arr1[0] = arr[0];
        for ( int i = 1 ; i < arr.length ; i++){

            arr1[i] = arr1[i-1] + arr[i];
        }
        // for ( int i = 0 ; i < arr1.length ; i++ ){
        //     System.out.print(arr1[i] + "->");
        // }
        for( int i = 0 ; i < row ; i++ ){
            int count=0;
            for( int j = 0 ; j < col ; j++ ){
                sub[i][j] = arr[count];
                count++;
            }
        }

        for( int i = 0 ; i < row ; i++ ){
            for ( int j = 0 ; j < col ; j++ ){
                System.out.print(sub[i][j]);
            }
            System.out.println();
        }
    }

    //note: prefix sum : prefix adding
    public void prefix(int l ,int r, int []arr){
        int []pre = new int[arr.length];
        pre[0] = arr[0];
        for ( int i = 1 ; i < arr.length ; i++ ){
            pre[i] = pre[i-1] + arr[i];
        }
        System.out.print(pre[r] - pre[l] );
        // print statement 
        

    }

    public void queris(){
        int []arr = {10,20,30,40,50};
        int l = 2;
        int r = 4;

        prefix( l-1 , r , arr);
    }

    public void subArrayOddLength(){

        int []arr = {1,2,3,4,5};
        int len = arr.length;

        int n = len;

        int pref[] = new int[arr.length];
        pref[0] = arr[0];
    
        for ( int i = 1 ; i < len ; i++ ){
            pref[i] = pref[i-1] + arr[i];
        }

        int max = 0;
        for( int i = 0 ; i < len ; i++ ){
            for( int j = i ; j < len ; j++ ){
               if ( (j - i + 1) % 2 != 0 ){
                if ( i == 0 ){
                    max += pref[j];
                }
                else {
                    max += pref[j] - pref[i-1];
                }
               }
            }
        }
        System.out.print(max);
    }
}

