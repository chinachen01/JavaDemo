package guava.object;

/**
 * Created by focus on 17/3/31.
 */
public class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "name:" + this.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name);
    }
}
