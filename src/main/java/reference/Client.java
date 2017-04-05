package reference;

/**
 * Created by focus on 17/3/29.
 */
public class Client {
    public static void main(String[] args) {
        Model model = new Model();
        Car car = new Car(null);
        model = null;
        System.gc();
    }
}
