package guava.clone;

/**
 * Created by focus on 17/4/1.
 */
public class Person implements Cloneable{
    public String name;
    public Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.car = (Car) person.car.clone();
        return person;
    }
}
