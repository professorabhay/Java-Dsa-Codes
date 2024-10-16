package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(2);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n); // print 10 - 1
        fun(n-1);
        System.out.println(n); // print 1 - 10 because it's printing while emptying stack
    }
}