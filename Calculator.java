//1. Simple Calculator 
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, sum;
        
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        
        sum = num1 + num2;

        System.out.println("Sum is: " + sum ); 
        scanner.close();
    }
}
