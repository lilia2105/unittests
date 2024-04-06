package z4test;


import org.example.z4.Person;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTest {

    @Test
    public void testPersonConstructor() {
        Person person = new Person("Alice", "Smith", 30);
        assertEquals("Alice", person.firstName);
        assertEquals("Smith", person.lastName);
        assertEquals(30, person.age);
    }
}
