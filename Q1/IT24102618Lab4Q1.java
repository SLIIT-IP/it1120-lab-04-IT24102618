import java.util.Scanner;


public class IT24102618Lab4Q1{
       public static void main(String[] args) {
 
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number:");
       double number = scanner.nextDouble();
    if(number<0){
      System.out.print("The number is:Negative");
    }
     else if(number>0){
     System.out.print("The number is:Positive");
     }
     else{System.out.print("The number is:zero");
      }
     scanner.close();
    }
}    