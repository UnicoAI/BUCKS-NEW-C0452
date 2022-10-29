import java.util.Scanner;

class dayscalc {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your year of birth  ");

    // takes input from the keyboard
    int year = input.nextInt();
    System.out.print("Enter your month of birth  ");

    // takes input from the keyboard
    int month = input.nextInt();
    System.out.print("Enter your day of birth  ");

    // takes input from the keyboard
    int day = input.nextInt();
    int ageresult = (2022 - year + 10 - month + 03 - day)*365;
    System.out.print("You have " + ageresult + "days");



    // closes the scanner
    input.close();
  }
}