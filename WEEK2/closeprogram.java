
import java.util.Scanner;

public class closeprogram {
    /**
     * @param args
     */
    public static void main(String[] args) {
      //declare varaible for creating do while  
      String answer;
      //create number and multiplier variables
     do { int number, multiplier;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter The Number");
      number = input.nextInt();
      //create output loop result until answer is no using while
      
      for( multiplier = 1; multiplier <= 12; multiplier++) {
        System.out.println( number + "*" + multiplier +  "=" + (number * multiplier) );
      }
      System.out.println("Do you wanna Restart? Yes or No");
      answer = input.next();
    
    }
    while (answer.equalsIgnoreCase("Yes"));
    if (answer.equalsIgnoreCase("No"));
    System.out.println("Goodbye!");

    
    }
}
