package design.factory;


/**
 * Created by focus on 16/11/17.
 */
public class Car {
    public String name;
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void drive() {
        System.out.println("drive " + getName());
    }


}
