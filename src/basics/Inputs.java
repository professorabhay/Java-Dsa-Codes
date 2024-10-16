import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your Roll Number: ");
            int rollNum = input.nextInt();
            System.out.println("Your roll number: " + rollNum);
        }
    }
}
