
import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
     // declare the variables
      int number, multiplier;
      //open scanner
      Scanner input = new Scanner(System.in);
      //print question
      System.out.println("Enter The Number");
      //take input as variable
      number = input.nextInt();
      //close scanner
      input.close();
      //loop result
      for( multiplier = 1; multiplier <= 12; multiplier++) {
        System.out.println( number + "*" + multiplier +  "=" + (number * multiplier) );
      }
      }  
}