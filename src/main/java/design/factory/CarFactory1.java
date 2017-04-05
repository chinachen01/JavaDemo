package design.factory;

/**
 * Created by focus on 16/11/17.
 */
public class CarFactory1 {
    public static Car newCar(String carName) {
        if (carName.equals("Benz")) {
            return new BenzCar();
        }
        return new BMWCar();
    }
}
