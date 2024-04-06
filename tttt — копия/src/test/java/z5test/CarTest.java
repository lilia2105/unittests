package z5test;


import org.example.z5.Car;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarTest {

    @Test
    public void testCarMethods() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.start();
        car.stop();
    }
}
