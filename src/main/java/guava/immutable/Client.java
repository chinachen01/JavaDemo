package guava.immutable;

import com.google.common.collect.*;

/**
 * Created by focus on 17/4/1.
 */
public class Client {
    public static void main(String[] args) {
        ImmutableSet<Person> immutableSet = ImmutableSet.of(new Person("lisi"),
                new Person("wangwu"),
                new Person("zhangsan"),
                new Person("chener")
                );
        ImmutableSet<Person> all = ImmutableSet.<Person>builder().addAll(immutableSet)
                .add(new Person("chaoren"))
                .build();
        ImmutableSet<Person> copy = ImmutableSet.copyOf(immutableSet);
        immutableSet.asList().forEach((person -> System.out.println(person.name)));
        Ordering<Person> ordering = Ordering.natural()
                .onResultOf(person -> person.name);
        ImmutableList<Person> lists = ordering.immutableSortedCopy(all);
        System.out.println(immutableSet);
        System.out.println(copy);

    }
}
