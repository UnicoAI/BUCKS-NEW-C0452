class Student{
    int ID;
    String Name;
  int Grades;
  public void gradelevel(){
     
      if(Grades>=80){
          Grades = 'A';
       }else if(Grades>=60 && Grades<80){
          Grades = 'B';
       }
       else if(Grades>=40 && Grades<60){
          Grades = 'C';
       }
       else {
          Grades = 'D';
       }
  
       switch(Grades) {
          case 'A' :
             System.out.println("Excellent! You achieved Grade A");
             break;
         
          case 'B' :
             System.out.println("Well done You achieved Grade B");
             break;
          case 'C' :
             System.out.println("You passed You achieved Grade C");
          case 'F' :
             System.out.println("Better try again");
             break;
          default :
          System.out.println("Invalid grade");
       }
       System.out.println("Your grade is " + Grades);
    }
  
  
  public Student(int grades) {
      Grades = grades;
  }
  
  public int getGrades() {
      return Grades;
  }
  
  public void setGrades(int grades) {
      Grades = grades;
  }
  
  public int getID() {
        return ID;
    }
   
    public Student(int iD, String name) {
        ID = iD;
        Name = name;
    }
    public Student(int i, String string, int j) {
      ID = i;
        Name = string;
        Grades = j;
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
   * @param j
     * 
     */
    public void gradeArray(){
      int[] grades = {20,40,60,80};
      
      for (int i = 0; i < grades.length; i++) {
        System.out.println("Student Grades are as follow: " + (grades[i]));}
      }
    void enroll(Course Course){
        System.out.println("The Student " + Name  + " is enrolled to " + Course.name + " and achieved" + Grades);
    }
    void marks(){
      System.out.println("The student " + Name + " marks value is " + Grades);
    }
  
  
  
  }
