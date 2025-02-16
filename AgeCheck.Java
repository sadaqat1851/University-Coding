//5. Age Eligibility Check (Syntax Errors)
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Incorrect assignment operator (== instead of =)

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");

        }
        
        input.close();
    }
}
