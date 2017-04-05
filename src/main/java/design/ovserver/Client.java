package design.ovserver;

/**
 * Created by focus on 16/12/13.
 */
public class Client {
    public static void main(String[] args) {
        Lisi lisi = new Lisi();
        Spider spider = new Spider();
        lisi.addObserver(spider);
        lisi.say("hello");
        lisi.deleteObservers();
    }
}
