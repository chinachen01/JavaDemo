package design.factory;

import annotation.CarType;
import org.reflections.Reflections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by focus on 16/11/17.
 */
public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ConcurrentHashMap<String, Car> cars = produceCars();
        Iterator it = cars.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Car> entry = (Map.Entry) it.next();
            String name = entry.getKey();
            Car car = entry.getValue();
            car.setName(name);
            car.drive();
        }
    }

    public static ConcurrentHashMap<String, Car> produceCars() throws IllegalAccessException, InstantiationException {
        ConcurrentHashMap<String, Car> maps = new ConcurrentHashMap<>();
        Reflections reflections = new Reflections("design.factory");
        Set<Class<?>> annotationClass = reflections.getTypesAnnotatedWith(CarType.class);
        for (Class<?> car : annotationClass) {
            CarType carType = car.getAnnotation(CarType.class);
            Car obj = (Car) car.newInstance();
            maps.put(carType.name(), obj);
        }
        return maps;
    }
}
