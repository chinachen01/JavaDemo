package reference;

/**
 * Created by focus on 17/3/30.
 */
public class Model {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Model 被回收了：" + this);
    }
}
