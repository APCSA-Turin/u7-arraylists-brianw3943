import java.util.ArrayList;
import java.util.Arrays;
public class Runner {
    public static void main(String args[]) {
        Car car1 = new Car("a", 1000);
        Car car2 = new Car("b", 2000);
        Car car3 = new Car("c", 3000);
        Car[] carArray = {car1, car2, car3};
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(cars);
    }
}
