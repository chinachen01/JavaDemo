package design.ovserver;

import java.util.Observable;

/**
 * Created by focus on 16/12/13.
 */
public class Lisi extends Observable{
    public void say(String something) {
        setChanged();
        notifyObservers(something);
    }
}
