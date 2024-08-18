import java.util.Scanner;


public class IT24102618Lab4Q3{
       public static void main(String[] args) {
 
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number:");
       double number = scanner.nextDouble();
    String result = (number<0) ? "The number is: negative" :
                    (number>0) ? "The number is: positive" :
                     "The number is: zero";
   System.out.println(result);

     scanner.close();
    }
}    