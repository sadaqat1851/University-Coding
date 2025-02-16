//3. Fahrenheit to Celsius Converter (Syntax Errors)
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); 
        
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;  // Incorrect division (should be 5.0 / 9.0)
        
        System.out.println("Temperature in Celsius: " + celsius);  // Incorrect variable name (should be celsius)
        
        scanner.close();
    }
}
