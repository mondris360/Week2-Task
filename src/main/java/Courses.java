import java.util.ArrayList;
import java.util.List;

public class Courses {
    private String courseName;
    private List<String> courses;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.courses = new ArrayList<>();
    }


    // method to return all courses;
    public List<String> getAllCourses() {
        return courses;
    }

    public String getCourseName() {
        return courseName;
    }



}
