package design.adapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by focus on 16/12/13.
 */
public class Adapter extends Adaptee implements IRequest {
    @Override
    public void request() {
        super.specialRequest();
        HashMap<String, String> maps = new HashMap<>();
        maps.put("name1", "chen lin1");
        maps.put("name2", "chen lin2");
        maps.put("name3", "chen lin3");
        maps.put("name4", "chen lin4");
        maps.put("name5", "chen lin5");
        Iterator<Map.Entry<String, String>> iterator = maps.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "=== value:" + value);
        }
    }
}
