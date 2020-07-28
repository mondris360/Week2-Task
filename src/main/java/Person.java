
public class Person {
    private String firstName;
    private String lastName;
    private  int age;
    private Address address;  //  This Person Object has an Aggregation Relationship with The Address Object

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public boolean setFirstName(String firstName) {
        this.firstName = firstName;
        return true;
    }

    public boolean setLastName(String lastName) {
        this.lastName = lastName;
        return true;
    }

    public boolean setAge(int age) {
        this.age = age;
        return true;
    }
    
}
