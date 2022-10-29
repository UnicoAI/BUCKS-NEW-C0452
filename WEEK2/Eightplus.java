import java.util.Scanner;
  class Eightplus{
 public static void main(String[] args) {
 //create scanner object
 Scanner input = new Scanner(System.in);

//take input from keyboard
System.out.print("What is your age?");
int age = input.nextInt();
//add variable year born
int bornyear = 2022 - age;
//use if else to print statements for variable around 18y
if (bornyear > 18) {
System.out.println("You are born in the year " + bornyear);}
 
 else {
  System.out.println("you are to young. come back later!");
 }
 }
}

