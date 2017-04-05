package guava.string;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

/**
 * Created by focus on 17/4/1.
 */
public class Client {
    public static void main(String[] args) {
        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println(joiner.join("Harry", null, "Ron"));

        String testString = ",a,,b,";
        String[] strings = testString.split(",");
        for (String string : strings) {
            System.out.println(string + "=");
        }
        Iterable<String> iterable = Splitter.on(",")
                .trimResults()
                .omitEmptyStrings()
                .split(testString);
        iterable.forEach(string -> System.out.println(string + "="));

        //test pattern

        String patterString = ".123asd1231basd123asaf123";
        System.out.println(patterString.matches("^\\.[\\d.a-zA-Z]*|\\d{5}|\\d{8}$"));
    }
}
