//2. Even or Odd Checker (Syntax Errors)
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 2 == 0); { // Missing parentheses around condition
            System.out.println("The number is even."); 
        } else { // Missing opening curly brace
            System.out.println("The number is odd.");
 }
        
        input.close();
    }
}
