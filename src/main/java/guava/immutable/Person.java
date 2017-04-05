package guava.immutable;

/**
 * Created by focus on 17/4/1.
 */
public class Person implements Cloneable{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
