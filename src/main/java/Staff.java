import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// demonstrating the use of abstract class
public abstract  class Staff extends  Person{
    private String staffID;
    private LocalDate employmentDate;
    private String jobTitle;
    private double salary;
    private boolean onDuty =  false;
    private int getHours = LocalTime.now().getHour();


    public Staff(String firstName, String lastName, int age, Address address,LocalDate employmentDate, String jobTitle, double salary) {
        super(firstName, lastName, age, address);
        this.staffID = generateStaffID();
        this.employmentDate = employmentDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    // method to generate staff ;
    public static String generateStaffID() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
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
}
