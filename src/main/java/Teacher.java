import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff {

    private String phoneNo;
    private Courses schoolCourses;
    private List<String> mycourses;
    private List<Classes> allClasses;

    public Teacher(String firstName, String lastName, int age, Address address, LocalDate employmentDate, String jobTitle, double salary, String phoneNo, List<List> mycourses) {
        super(firstName, lastName, age, address, employmentDate, jobTitle, salary);
        this.phoneNo = phoneNo;
        this.mycourses = new ArrayList<String>();
    }


    // method to allow  a teacher to teach any of her courses
    public boolean teachCourse(String courseName, String className){
        // check if the course was assigned to the teacher
        boolean isMyAssignedCourse = mycourses.contains(courseName);
        // check if the class exists in the school
        boolean isValidClass   = allClasses.contains(className);

        if(!isMyAssignedCourse){
            System.out.println("Invalid Course Name");
            return false;
        } else if (isValidClass){
            System.out.println("Invalid Class Name");
            return false;
        } else {
            System.out.println("Now Teaching  " + className + " " +  courseName);

            return true;
        }


    }
    // skipping their implementation because of time
    public boolean startDuty(){};
//    public boolean takeLunchBreak(){};

}
