

import java.util.Scanner;

public class Marks100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for input, declare inputGrade variable, 
       
        System.out.print("Enter your grade (0-100): ");
        int inputGrade = input.nextInt();
        
        // use if else to compare results and print result
        if(inputGrade > 70){
            System.out.println("The value for grade " + inputGrade + 
                " is A");
            
        }
        else if(inputGrade < 70){
            System.out.println("The  value for grade " + inputGrade + 
                " is B");
            
        }
        else if(inputGrade < 50){
            System.out.println("The  value for grade " + inputGrade +
                " is C");
            
        }
        else if(inputGrade < 40){
            System.out.println("The  value for grade " + inputGrade + 
                " is D");
            
        }
        else if(inputGrade < 20){
            System.out.println("The  value for grade " + inputGrade + 
                " is E");
            
        }
        else if(inputGrade < 10){
            System.out.println("The numeric value for grade " + inputGrade + 
                " is failed");
            
        }
        else{
            System.out.println(inputGrade + " is an invalid grade");
        }
        
       
        
    }


    
   
}