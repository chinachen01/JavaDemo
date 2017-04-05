package design.adapter;

/**
 * Created by focus on 16/12/13.
 */
public class Adaptee implements ISpecialRequest {
    @Override
    public void specialRequest() {
        System.out.println("special request");
    }
}
