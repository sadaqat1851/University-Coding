import java.util.*;
  
   public class GradedTask2 {
    
     static Scanner console = new Scanner(System.in);
     
      public static void main(String[] args) {
    
      int width;
    
      int length;

      int area;
 
      int perimeter;

      System.out.print("Enter the width: ");
     
      width = console.nextInt(); 
 
      System.out.print("Enter the length: "); 

      length = console.nextInt(); 
    
      area = length * width; 

      System.out.println("Area = " + area);

      perimeter = 2 * (length + width); 
 
      System.out.println("Perimeter = " + perimeter);

      System.out.println(); 

   }

}

     
     
 
     

     
