import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTest {
    private Address address;
    private Person person;

    @BeforeEach()
    public void setup(){
        address =  new Address("No 4A Ice Road", "Benin","Edo", "234","Nigeria");
        person = new Person("Mark", "Andrew", 25, address );
        System.out.println("Running Test...");
    }

    // test cases for the setFirstName Method
    public static Object[][] Tests_Conditions_setFirstName_Method(){
        return new Object[][]{
                // should not add new teacher
                {" "},
                {"  "},
                {null},
                {5000},
                {0},
                {-3542}

        };
    }
    // should not sack teacher
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setFirstName_Method")
    @Test
    void shouldNot_Set_FirstName(String firstName){
        boolean setFirstName = person.setFirstName(firstName);
        Assertions.assertFalse(setFirstName);
    }

    @Test
    void should_Set_FirstName(){
        boolean setFirstName = person.setFirstName("Mondris");
        String getFirstName =  person.getFirstName();
        String expectedResult = "Mondris";
        Assertions.assertTrue(setFirstName);
        Assertions.assertEquals(expectedResult, getFirstName);
    }

    // test cases for  setFirstName Method
    public static Object[][] Tests_Conditions_setLastName_Method(){
        return new Object[][]{
                // should not add new teacher
                {" "},
                {"  "},
                {null},
                {5000},
                {0},
                {-3542}

        };
    }

    @ParameterizedTest
    @MethodSource("Tests_Conditions_setLastName_Method")
    @Test
    void shouldNot_Set_LastName(String LastName){
        boolean setLastName = person.setLastName(LastName);
        Assertions.assertFalse(setLastName);
    }

    @Test
    void should_Set_LastName(){
        boolean setLastName= person.setLastName("James");
        String getLastName =  person.getLastName();
        String expectedResult = "James";
        Assertions.assertTrue(setLastName);
        Assertions.assertEquals(expectedResult, getLastName);
    }

    // test case for the set age method

    public static Object[][] Tests_Conditions_setAge_Method(){
        return new Object[][]{
                // should not add new teacher
                {" "},
                {"  "},
                {null},
                {101},
                {0},
                {-3542}

        };
    }

    @ParameterizedTest
    @MethodSource("Tests_Conditions_setAge_Method")
    @Test
    void shouldNot_Set_Age(int age){
        boolean setAge = person.setAge(age);
        Assertions.assertFalse(setAge);
    }

    @Test
    void should_Set_Age(){
        boolean setAge = person.setAge(40);
        int getAge =  person.getAge();
        int expectedResult = 40;
        Assertions.assertTrue(setAge);
        Assertions.assertEquals(expectedResult, getAge);
    }

}
