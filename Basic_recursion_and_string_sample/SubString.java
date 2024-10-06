class SubString{
    

    public static void print( String str , String ans , int index ){
        if (index == str.length() ){
            System.out.println(ans);
            return;
        }
        print(str , ans +"-" , index+1);
        print(str , ans + str.charAt(index) , index+1);
    }
    public static void main(String[] args){
            String str =  "ab";  //idea: example string
            print(str , "" , 0);

    }
}