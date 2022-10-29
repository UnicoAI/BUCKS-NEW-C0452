import java.util.Scanner;

class Interest {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Deposit amount: ");

    // takes input from the keyboard
    int deposit = input.nextInt();
    // create a 3rd variable
    double conversion = deposit * 1.01;

    // prints the result
    System.out.println("That means at the end of the year your savings will be " + conversion +" british ponds");

    // closes the scanner
    input.close();
  }
}