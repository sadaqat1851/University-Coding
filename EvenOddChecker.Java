import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 2 == 0) { // Removed the semicolon
            System.out.println("The number is even."); 
        } else { // Changed 'elif' to 'else'
            System.out.println("The number is odd.");
        }
        
        input.close(); // Changed 'scanner' to 'input'
    }
}
 
//  Output 
//  Enter a number: 5