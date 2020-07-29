import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String studentID;
    private String studentClass;
    private List<Courses> schoolCourses;
    private List<String> myCourses;

    public Student(String firstName, String lastName, String studentID, int age, Address address, String studentClass) {
        super(firstName, lastName, age, address);
        this.studentID = studentID;
        this.studentClass = studentClass;
    }

    public String getStudentID() {
        return studentID;
    }
    public String getFirstName(){
        return getFirstName();
    }
    public String getLastName(){
        return getLastName();
    }

    public void printAllSchoolCourse(){
        for (Courses course: schoolCourses){
            System.out.println(course.getCourseName());
        }
    }

    // take a course
    public boolean takeCourse(String courseName){
        boolean courseExists = findCourse(courseName);
        if(courseExists){
            myCourses.add(courseName);
            System.out.println("You Have Taken The Course");
            return  true;
        }
        System.out.println("Invalid Course Name");
        return false;
    }

    // method to view my courses
    public boolean  myCourses(){

        for (int x = 0;  x < myCourses.size(); x++){
            System.out.println(myCourses.get(x));
        }
        return true;
    }

    // method to search for a course name
    public boolean findCourse (String courseName){
         for (Courses course: schoolCourses){
             if(course.getCourseName().equals(courseName)){
                 return true;
             }
         }
         return false;
    }

}
