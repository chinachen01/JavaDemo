package guava.clone;

/**
 * Created by focus on 17/4/1.
 */
public class Car implements Cloneable{
    public String name;
    public Wheel wheel;

    public Car(String name, Wheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
