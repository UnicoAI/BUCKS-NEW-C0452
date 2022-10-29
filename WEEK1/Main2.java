import java.util.Scanner;

class Main2 {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter height: ");
    // takes input from the keyboard
    int height = input.nextInt();
    
    System.out.print("Enter length: ");
    // takes input from the keyboard
    int length = input.nextInt();
     
    // prints the name
    System.out.println("Perimeter is " + (length*height)*2);
    System.out.println("Area is " + length*height);

    // closes the scanner
    input.close();
  }
}