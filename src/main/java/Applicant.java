import java.util.List;

public class Applicant extends Person{
    private String className;

    public Applicant(String firstName, String lastName, int age, Address address, String className) {
        super(firstName, lastName, age, address);
        this.className = className;
    }
}



