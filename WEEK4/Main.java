import java.util.Random;
public class Main{


public static void main(String[] args) {
  // create an object of student
      Student Student1=new Student(1985, "Daniel Boncica", 50);
    
     
      Student1.idStudent();
     
     // enroll student to the courses using method from class course
      Course Course1=new Course("C0451", "Java COURSE");
      Course Course2=new Course("C0452", "WEB Design COURSE");
      Course Course3=new Course("C0453", "Python COURSE");
      Course Course4=new Course("C0454", "C ++ COURSE");
      Student1.enroll(Course1);
      Student1.enroll(Course2);
      Student1.enroll(Course3);
      Student1.enroll(Course4);
      
      // adding marks to the arraylist created for integers
    Student1.marks();
    
    Student1.gradeArray();
    Student1.gradelevel();
//create module object
      Module s1= new Module("bucks new", 1);
   s1.moduleArray();
  //enroll student to the module
   Student Student2=new Student(1985, "Daniel Boncica", 50);
    
      // create instance of Random class 
      Random Grades= new Random(); 
  
      // Generate random integers in range 0 to 100 
      int grades = Grades.nextInt(100); 
      System.out.println("Student " + Student2.getName() + " " + Student2.getGrades());
      
}
}




