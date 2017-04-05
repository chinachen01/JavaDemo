package design.factory;

/**
 * Created by focus on 16/11/18.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人皮肤是黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话听不懂");
    }
}
