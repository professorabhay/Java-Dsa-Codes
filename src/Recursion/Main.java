package Recursion;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            message();
            msgRecursion(1);
        }
    }

    static void message(){
        System.out.println("Hello World");
    }

    static void msgRecursion(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        msgRecursion(n + 1); // It will use separate memory in stack. So, base condition is so important.
    }
}
