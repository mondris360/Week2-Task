import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

// parameterized test
public class PrincipalTest {

    private static Principal principal;

    @BeforeEach
    public void setup() {
        principal = new Principal();
        System.out.println("Running Test....");
    }

    // test conditions and expected result for admitNewStudent method
    public static Object[][] admitNewStudent_TestConditions() { // factory method
        return new Object[][]{
                {"", "JSS1", 11, false},
                {"  ", "JSS3", 13, false},
                {null, "SS3", 16, false},
                {null, null, null, false},
                {null, "SS1", null, false},
                {"James Mark", null, 15, false},
                {"Ade Jude", "SS1", 11, false},
                {"Ade Jude", " ", 15, false},
                {"Ade Jude", "@", 15, false},
                {"@", "SS1", 13, false},
                {"@", "@", 15, false},
                {"Adams", "SS6", 16, false}
        };
    }

    @ParameterizedTest
    @MethodSource("admitNewStudent_TestConditions")
    @Test
    void testConditions_admitStudents_Method(String applicantName, String applicantClass, int applicantAge, boolean expectedResult) {
        boolean admitNewStudent = principal.admitNewStudent(applicantName, applicantClass, applicantAge);
        Assertions.assertEquals(expectedResult, admitNewStudent);
    }

    // avoid admitting new students when max class capacity has been reached
    @Test
    void shouldNotAdmitStudent_When_MaxCapacityHasBeenReached() {
        boolean newClass = principal.createNewClass("JSS1",515,10,1);
        boolean newStudent1 = principal.admitNewStudent("Mark", "JSS1", 14);
        boolean newStudent2 = principal.admitNewStudent("Mark", "JSS1", 14);
        Assertions.assertEquals(false, newStudent2);
    }


    // test conditions and expected result for admitNewStudent method
    public static Object[][] expelStudent() { // factory method
        return new Object[][]{
                {"", "JJS", "Bad attitude" , false},
                {" ", "45245", "Bad attitude" , false},
                {null, null , null, false},
                {null, "JSS1" , null, false},
                {"Ade", null , null, false},
                {"Ade", "@" ,  null, false},
                {"Mark", "SS8", "Bad attitude" , false},

        };
    }
    @ParameterizedTest
    @MethodSource
    @Test
    void testConditions_expelStudent_Method(String studentName, String studentClass, String reason, boolean expectedResult){
        boolean expelStudent =  principal.expelStudent(studentName, studentClass, reason);
        Assertions.assertFalse(expelStudent);
    }
    // EXTRA TESTS FOR THE expelStudent METHOD
    @Test
    void testConditions_shouldNot_Expel_Student(){
        boolean addNewStudent = principal.admitNewStudent("Mark", "JSS2",20);
        boolean expelStudent1 = principal.expelStudent("James", "SS1", "reason");
        boolean  expelStudent2 = principal.expelStudent("Thomas", "SS10","reason" );
        Assertions.assertFalse(expelStudent1);
        Assertions.assertFalse(expelStudent2);
    }

    // More  TESTS FOR THE expelStudent METHOD
    @Test
    void testConditions_should_Expel_Student(){
        boolean addNewStudent = principal.admitNewStudent("Mark", "JSS2",20);
        boolean expelStudent1 = principal.expelStudent("Mark", "JSS2", "reason");
        boolean  expelStudent2 = principal.expelStudent("Mark", "JSS2",null );
        boolean  expelStudent3 = principal.expelStudent("Mark", "JSS2","" );
        Assertions.assertTrue(expelStudent1);
        Assertions.assertTrue(expelStudent2);
        Assertions.assertTrue(expelStudent3);
    }

    // TEST CASE FOR addNewTeacher METHOD
    public static Object[][] Tests_Conditions_expectedResult_addNewTeacher(){
        return new Object[][]{
                // should not add new teacher
                {"Mark", 0,  false},
                {"  ", 35000, false},
                {"Mark", -854785, false},
                {null, null, false},
                {null, 25410,  false},
                {"James", null,  false},
                {"James", "",  false},
                {"James", "asdhdh",  false},
                {5478545, "asdhdh",  false},
                {5478545, 548854,  false},
                {5478545, 548854,  false},

                // should add  new teacher
                {"Mark", 35000, true},
        };
    }


    @ParameterizedTest
    @MethodSource("Tests_Conditions_expectedResult_addNewTeacher")
    @Test
    void test_Conditions_For_AddNewTeacher_Method(String teacherName, double salary, boolean expectedResult){
        boolean addNewTeacher =  principal.addNewTeacher(teacherName, salary);
        Assertions.assertEquals(addNewTeacher, expectedResult);
    }

    
}