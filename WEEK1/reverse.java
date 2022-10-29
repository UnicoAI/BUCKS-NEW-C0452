import java.util.Scanner;

class reverse {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
// takes input from the keyboard
    System.out.print("Enter value1: ");
    
    int value1 = input.nextInt();
     // takes input from the keyboard
    System.out.print("Enter value2: ");
   
    int value2 = input.nextInt();
     
    // prints the name
    System.out.println("You entered " + value1 + value2);
    System.out.println("Reversed Number are " + value2 + value1);

    // closes the scanner
    input.close();
  }
}