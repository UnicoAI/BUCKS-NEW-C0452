import java.util.ArrayList;

class Module{    //generate class modules and declare attributes
    String nameModule;
    int codeModule;
    public Module(String BuckNew, int level4) {  //create constructors
        this.nameModule = BuckNew;
        this.codeModule = level4;
    }
    public String getNameModule() { ///getters and setters to get or add values to the modules
        return nameModule;
    }
    public void setNameModule(String nameModule) {
        this.nameModule = nameModule;
    }
    public void setCodeModule(int codeModule) {
        this.codeModule = codeModule;
    }
    public int getCodeModule() {
        return codeModule;
    }
    /**
     * 
     */
    public void moduleArray(){   //create an object arraylist with the courses
        ArrayList<String> course = new ArrayList<String>();
        course.add("Java Course");
        course.add("Web Design Course");
        course.add("Python Course");
        course.add("C ++ Course");
        ArrayList<Integer> gradeac = new ArrayList<Integer>();  //wrapper integers arraylist for grades
        gradeac.add(20);
        gradeac.add(40);
        gradeac.add(60);
        gradeac.add(90);

        for (int i = 3; i < course.size(); i++) {
            System.out.println("Student is enrolled to " + course + gradeac );
            System.out.println("Student achieved " + gradeac);
          
        }
    }
}
