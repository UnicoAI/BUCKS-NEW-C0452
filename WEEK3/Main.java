class Student{
    int ID;
    String Name;
    public int getID() {
        return ID;
    }
    public Student(int iD, String name) {
        ID = iD;
        Name = name;
    }
    public Student(int i, String string, int j) {
    }
    public String getName() {
        return Name;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setName(String name) {
        Name = name;
    }
    

    public void idStudent(){
    System.out.println("Student ID IS " + ID + " and Student name is " + Name);}
   
    /**
     * 
     */
    void enroll(Course Course){
        System.out.println("The Student " + Name  + " is enrolled to " + Course.name);
    }
    public void gradelevel() {
    }
    public void marks() {
    }
    public void gradeArray() {
    }
}
class Course{
    String Code;
    public Course(String code, String name) {
        Code = code;
        this.name = name;
    }
    String name;
    public void idCourse(){
        System.out.println("Course Code is " + Code + " and Course name is " + name);
    }

}
public class Main {
    public static void main(String[] args) {
        Student Student1=new Student(1985, "Daniel Boncica");
       
        Student1.idStudent();
       
        Course Course1=new Course("C0452", "JavaCOURSE");
        Student1.enroll(Course1);
     
    
}
}
