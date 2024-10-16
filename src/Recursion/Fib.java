package Recursion;
public class Fib {
    public static void main(String[] args) {
        int ans = fib(3);
        System.out.println(ans);
    }

    static int fib(int n){
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
