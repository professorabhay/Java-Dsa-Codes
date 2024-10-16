public class overloading {
    public static void main(String[] args) {
        fun(1);
        fun();
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(){
        System.out.println("Hello");
    }
}

//functions with same name with different arguments can exist
