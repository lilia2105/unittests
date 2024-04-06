package z1Test;

import org.example.z1.Animal;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testAnimalConstructor() {
        Animal animal = new Animal();
        animal.name = "Leo";
        animal.age = 3;
        assertEquals("Leo", animal.name);
        assertEquals(3, animal.age);
    }
}
