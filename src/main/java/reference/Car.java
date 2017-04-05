package reference;


import com.sun.istack.internal.Nullable;

/**
 * Created by focus on 17/3/29.
 */
public class Car {
    private Model model;

    public Car(@Nullable Model model) {
        this.model = model;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("car 被回收了：" + this);
    }
}
