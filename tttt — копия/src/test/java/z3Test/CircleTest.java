package z3Test;


import org.example.z3.Circle;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5.0, "red");
        assertEquals(Math.PI * 5.0 * 5.0, circle.calculateArea(), 0.0001);
    }
}
