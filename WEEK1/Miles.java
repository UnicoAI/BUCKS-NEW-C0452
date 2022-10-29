import java.util.Scanner;

class Miles {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Feet Number: ");

    // takes input from the keyboard
    int feet = input.nextInt();
    // create a 3rd variable
    double conversion = feet / 5280;

    // prints the result
    System.out.println( feet + " feets mean " + conversion +" miles ");

    // closes the scanner
    input.close();
  }
}