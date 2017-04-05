package design.ovserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by focus on 16/12/13.
 */
public class Spider implements Observer{


    @Override
    public void update(Observable o, Object arg) {
        System.out.print(arg.toString());
    }
}
