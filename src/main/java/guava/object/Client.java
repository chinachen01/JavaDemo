package guava.object;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by focus on 17/3/31.
 */
public class Client {
    public static void main(String[] args) {
Ordering<Person> ordering = Ordering.natural()
        .reverse()
        .nullsLast()
        .onResultOf((person) -> {
            if (person == null) {
                return null;
            }
            return person.getName();
        });
List<Person> list = new ArrayList<>();
list.add(new Person("zhangsan"));
list.add(new Person("Lisi"));
list.add(null);
list.add(new Person("Lisi"));
list.add(new Person("wangwu"));
List<Person> orderedList = ordering.sortedCopy(list);
for (Person person : orderedList) {
    System.out.println(person);
}
    }

    public static int run(int a , int b) {
        int result = 0;
        try {
            System.out.println("try1");
            result = a/b;
            System.out.println("try2");
        } catch (Exception e) {
             e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return result;
    }
}
