package design.adapter;

/**
 * Created by focus on 16/12/13.
 */
public class Client {
    public static void main(String[] args) {
        IRequest request = new Adapter();
        request.request();
        HandlerThread handlerThread = new HandlerThread();
        handlerThread.start();
        handlerThread.getLooper();
    }
}
