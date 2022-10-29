class Course{    //declare attributes for class
    String Code;
    public Course(String code, String name) { //create constructors
        Code = code;
        this.name = name;
    }
    String name;
    public void idCourse(){   //add method to print details
     
        System.out.println("Course Code is " + Code + " and Course name is " + name);
        
    }
}