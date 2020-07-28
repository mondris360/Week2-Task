import java.util.Date;

public class Principal {
    //







    // methods
    public boolean  admitNewStudent(String applicantName, String applicantClass, int applicantAge){};
    public boolean expelStudent(String studentName, String studentClass, String reason){};
    public boolean addNewTeacher(String teacherName, double Salary){};
    public boolean sackTeacher(String teacherName){};
    public boolean createNewClass(String className, double schoolFees, int minStudentAge, int classCapacity){};
    public boolean assignCourse(String teacherName, String courseName){};
    public boolean addNewCourse(String courseName, String className){};
    public boolean removeCourse(String courseName){};
    public boolean increaseSchoolFees(String className, double newSchoolFees){};
    public boolean decreaseSchoolFees(String className, double newSchoolFees){};
    public void getAllStudentsInAClass(String className){}
    public int getTotalStudentsInAClass(String className){};


}
