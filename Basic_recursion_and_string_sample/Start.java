class Start{
    public static void main( String[] args){
        conmbainfun();
    }

    public static void conmbainfun(){
        System.out.println("PreOrder");
        fun1();
        System.out.println("Inorder");
        fun2();
        System.out.println("Ending");
    }
    public static void fun1(){
        System.out.println("Function One");
    }
    public static void fun2(){
        System.out.println("Function Two");
    }
}