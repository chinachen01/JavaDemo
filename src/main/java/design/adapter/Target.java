package design.adapter;

/**
 * Created by focus on 16/12/13.
 */
public class Target implements IRequest {
    @Override
    public void request() {
        System.out.println("normal request");
    }
}
