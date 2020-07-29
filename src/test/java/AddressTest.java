import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    // instance variable
    Address address;

    @BeforeEach
    public void setup(){
        address =  new Address("No4a ice road", "Benin", "Edo");
    }

    // Junit test for setAddress method()
    public static Object[][] Tests_Conditions_setAddress(){
        return new Object[][]{
                {" "},
                {"       "},
                {""},
                {null},
                {32545},
                {-85452},
                {0},
        };
    }
    // should not set address
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setAddress")
    @Test
    void shouldNot_Set_Street(String street ){
        boolean setAddress = address.setStreet(street);
        Assertions.assertFalse(setAddress);
    }

    // should set street
    @Test
    void should_Set_Street(){
        address.setStreet("No4 Ice Road");
        String  getStreet=  address.getStreet();
        String expectedResult  = "No4 Ice Road";
        Assertions.assertEquals(expectedResult, getStreet);
    }


    // Junit test for Set city method()
    public static Object[][] Tests_Conditions_setCity(){
        return new Object[][]{
                {" "},
                {"       "},
                {""},
                {null},
                {32545},
                {-85452},
                {0},
        };
    }


    // should not set city
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setCity")
    @Test
    void shouldNot_Set_City(String city ){
        boolean setCity = address.setCity(city);
        Assertions.assertFalse(setCity);
    }

    // should set city
    @Test
    void should_Set_City(){
        address.setStreet("Benin");
        String  getCity=  address.getCity();
        String expectedResult  = "Benin";
        Assertions.assertEquals(expectedResult, getCity);
    }

    // Junit test for Set State method()
    public static Object[][] Tests_Conditions_setState(){
        return new Object[][]{
                {" "},
                {"       "},
                {""},
                {null},
                {32545},
                {-85452},
                {0},
        };
    }


    // should not set State
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setState")
    @Test
    void shouldNot_Set_State(String state ){
        boolean setState = address.setState(state);
        Assertions.assertFalse(setState);
    }

    // should set State
    @Test
    void should_Set_State(){
        address.setStreet("Edo");
        String  getState =  address.getState();
        String expectedResult  = "Edo";
        Assertions.assertEquals(expectedResult, getState);
    }


    // Junit test for Set PostalCode method()
    public static Object[][] Tests_Conditions_setPostalCode(){
        return new Object[][]{
                {" "},
                {"       "},
                {""},
                {null},
                {1},
                {-85452},
                {0},
        };
    }


    // should not set PostalCode
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setPostalCode")
    @Test
    void shouldNot_Set_PostalCode(String postalCode ){
        boolean setPostalCode = address.setPostalCode(postalCode);
        Assertions.assertFalse(setPostalCode);
    }

    // should set PostalCode
    @Test
    void should_Set_PostalCode(){
        address.setStreet("234");
        String  getPostalCode=  address.getPostalCode();
        String expectedResult  = "234";
        Assertions.assertEquals(expectedResult, getPostalCode);
    }


    // Junit test for Set Country method()
    public static Object[][] Tests_Conditions_setCountry(){
        return new Object[][]{
                {" "},
                {"       "},
                {""},
                {null},
                {32545},
                {-85452},
                {0},
        };
    }


    // should not set Country
    @ParameterizedTest
    @MethodSource("Tests_Conditions_setCountry")
    @Test
    void shouldNot_Set_Country(String country ){
        boolean setCountry = address.setCountry(country);
        Assertions.assertFalse(setCountry);
    }

    // should set Country
    @Test
    void should_Set_Country(){
        address.setStreet("Nigeria");
        String  getCountry=  address.getCountry();
        String expectedResult  = "Nigeria";
        Assertions.assertEquals(expectedResult, getCountry);
    }
}