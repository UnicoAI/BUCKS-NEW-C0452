import java.util.Scanner;public static void reverse(String[] args) {


class Average {
  

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter value1: ");
    // takes input from the keyboard
    int value1 = input.nextInt();
    
    System.out.print("Enter value2: ");
    // takes input from the keyboard
    int value2 = input.nextInt();
    
    // prints the order lines
    System.out.println("You said " + value1 + value2);
    System.out.println("Reverse " + value2 + value1);
 

    // closes the scanner
    input.close();
  }
}