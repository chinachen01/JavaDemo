package design.factory;

/**
 * Created by focus on 16/11/18.
 */
public class YelloHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话好绕口");
    }
}
