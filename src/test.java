import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        int a = 10;
        String b = "Hello";
        char c = 'A';
        System.out.println(a + " " + b + " " + c);
    }
}
