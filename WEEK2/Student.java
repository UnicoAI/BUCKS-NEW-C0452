

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for input, declare gradeletter variable, 
        // add input to variable gradeletter
        System.out.print("Enter a letter grade: ");
         String gradeletter = input.nextLine();
       
        
        // Use if else to declare statements
        if(gradeletter.equals("A")){
            System.out.println("The value for grade " + gradeletter + 
                " is 1st");
           
        }
        else if(gradeletter.equals("B")){
            System.out.println("The  value for grade " + gradeletter + 
                " is 2.1");
           
        }
        else if(gradeletter.equals("C")){
            System.out.println("The  value for grade " + gradeletter +
                " is 2.2");
          
        }
        else if(gradeletter.equals("D")){
            System.out.println("The  value for grade " + gradeletter + 
                " is 3rd");
           
        }
        else if(gradeletter.equals("E")){
            System.out.println("The  value for grade " + gradeletter + 
                " is Ordinarry");
          
        }
        else if(gradeletter.equals("F")){
            System.out.println("The numeric value for grade " + gradeletter + 
                " is failed");
           
        }
        else{
            System.out.println(gradeletter + " is an invalid grade");
        }
       
    }
    
  
    
}