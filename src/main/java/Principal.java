import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Principal extends Staff{
    private boolean onDuty =  false;
    private int getHours = LocalTime.now().getHour();
    private List<Applicant> applicant;
    private Classes classes;
    private List<Courses> courses;
    private List<Staff> allStaff;
    private List<Student> students;
    private List<String>  prices = new ArrayList<String>();


    public Principal(String firstName, String lastName, int age, Address address, String staffID, LocalDate employmentDate, String jobTitle, double salary) {
        super(firstName, lastName, age, address, employmentDate, jobTitle, salary);
        this.applicant = new ArrayList<Applicant>();
        this.allStaff = new ArrayList<Staff>();
        this.students =  new ArrayList<Student>();
    }

    // methods
    public boolean startDuty(){
        if(!onDuty){
            onDuty = true;
            return true;
        } else {
            System.out.println("You have already Started Your Duty");
            return false;
        }
    }

    public boolean takeLunchBreak(){
        if ( getHours < 12){
            System.out.println("Sorry It's not yet time for lunch");
            return false;
        } else if( getHours > 13){
            System.out.println("Sorry, Lunch Time Has Passed");
            return false;
        }
        System.out.println("Going For Lunch");
        return true;
    }

    // method to admit new student to the school
    public boolean  admitNewStudent(String firstName, String lastName, int age, String studentClass,
                                    String street, String city, String state){
        int getMinAge = getMinRequiredClassAge(studentClass);
        // generate and ID for the student
        String studentID = generateStudentID();
        // if the applicant has  not gotten to the minimum age required for the class;
        if (getMinAge < 0){
            return false;
        }
        Address address =  new Address(street, city, state);
        Student newStudent =  new Student(firstName, lastName, studentID, age, address , studentClass);
        students.add(newStudent);
        System.out.println("New Student Created");
        System.out.println("Your Student Id = " + studentID);
        return true;
    };

    // method to create new className
    public boolean createNewClassName(String className, double schoolFees, int minStudentAge, int classCapacity){
            // check if the class is within the range of JSS1  TO SS3
            boolean isValidClassName = isValidClassName(className);
            if(!isValidClassName){
                return false;
            }
            // check if the class has already been created
            boolean classExists = findClassName(className);
            if(classExists){
                System.out.println("ClassName Already Exist");
                return false;
            }
            classes.addNewCourse(className, classCapacity);
            System.out.println("Class Created");
            return true;

    };

    // method to expel a student
    public boolean expelStudent(String studentID){
            for (Student student: students){
                student.getStudentID().equals(studentID);

                // delete the student from the student records
                students.remove(student);
                System.out.println("Student Has Been Expelled");
                return true;
            }

            System.out.println("Student Record Not Found");
            return false;
    }

    // method to add a new course to the list of courses in the school
    public boolean addNewCourse(String courseName){
        boolean courseExists = findCourse(courseName);
        if(!courseExists){
            courses.add(new Courses(courseName));
            System.out.println("Course Added");
            return  true;
        }
        System.out.println("Course Name Already Exist");
        return false;
    }

    // method to check if a course already exists.
    public boolean findCourse (String courseName){
        for (Courses course: courses){
            if(course.getCourseName().equals(courseName)){
                return true;
            }
        }
        return false;
    }


    // method to get min required age for each class
    public int getMinRequiredClassAge(String className){
        int minAge = 0;
        switch(className){
            case "JSS1":
                minAge = 11;
                break;
            case "JSS2" :
                minAge = 12;
                break;
            case "JSS3" :
                minAge = 13;
                break;
            case "SS1":
                minAge = 14;
                break;
            case "SS2":
                minAge = 15;
                break;
            case "SS3":
                minAge = 16;
                break;
        }
        return minAge;
    }


    // method to check if a className is valid
    public boolean isValidClassName(String className){
        boolean isValid;
        switch(className){
            case "JSS1":
            case "SS1":
            case "JSS2" :
            case "JSS3" :
            case "SS2":
            case "SS3":
                isValid = true;
                break;

            default:
                isValid = false;

        }

        return isValid;
    }

    // method to check if class name already exists
    public boolean findClassName(String newClassName){
       for (Classes className: classes){
           if (className.equals(newClassName)){
               return false;
           }
       }
       return false;
    }

    // method to generate staff or student ID;
    public static String generateStudentID() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
    // implementation skipped because of time
//    public boolean validateNewStudentDetails (String applicantName, String applicantClass, int applicantAge){
//
//
//        if (applicantName.isEmpty() || applicantClass.isEmpty() || applicantAge ==0 ){
//            return false;
//        }
//        if (applicantName.isBlank() || applicantName.equals("JSS3") || applicantAge == 13){
//            return false;
//
//        } else if (applicantName == null  || applicantName.equals("SS3") || applicantAge == 16){
//
//            return false;
//        } else if (applicantName == null  || applicantName == null || applicantAge == 0) {
//            return false;
//
//        } else if (applicantName == null  || applicantName == null || applicantAge == 0) {
//             return false;
//
//        } else if (applicantName == null  && applicantName.equals("SS1") || applicantAge == 0) {
//            return false;
//
//        } else if ( applicantName == true &&  applicantName.equals("SS1") || applicantAge == 0)) {
//
//                return false;
//        }
//
//
//
//
//    }
//    public boolean expelStudent(String studentName, String studentClass, String reason){};
//    public boolean addNewTeacher(String teacherName, double Salary){};
//    public boolean sackTeacher(String teacherName){};
//    public boolean assignCourse(String teacherName, String courseName){};
//    public boolean addNewCourse(String courseName, String className){};
//    public boolean removeCourse(String courseName){};
//    public boolean increaseSchoolFees(String className, double newSchoolFees){};
//    public double getSchoolFees(String className){};
//    public boolean decreaseSchoolFees(String className, double newSchoolFees){};
//    public void getAllStudentsInAClass(String className){}
//    public int getTotalStudentsInAClass(String className){};


}
