import java.util.Scanner;
  class borndate{
 public static void main(String[] args) {
 //create scanner object
 Scanner input = new Scanner(System.in);

//take input from keyboard
System.out.print("What is your age?");
int age = input.nextInt();
//add variable year born
int bornyear = 2022 - age;
//print year born
System.out.print("You are born in the year " + bornyear);
 // closes the scanner
 input.close();
}
  }