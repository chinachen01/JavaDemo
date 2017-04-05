package guava.clone;

/**
 * Created by focus on 17/4/1.
 */
public class Client {
    public static void main(String[] args) {
        Person p1 = new Person("Lisi", new Car("Baoma", new Wheel("miqilin")));
        try {
            Person p2 = (Person) p1.clone();
            System.out.println("p1:"+ p1);
            System.out.println("p1:"+ p1.name);
            System.out.println("p1:"+ p1.car);
            System.out.println("p1:"+ p1.car.wheel);
            System.out.println("p2:" + p2);
            System.out.println("p2:" + p2.name);
            System.out.println("p2:" + p2.car);
            System.out.println("p2:" + p2.car.wheel);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
