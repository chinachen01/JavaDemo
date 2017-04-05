package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by focus on 16/11/17.
 */
@Target(ElementType.FIELD)
public @interface CarColor {
     enum Color {
        BLUE,RED, GREEN
    }
    Color carColor() default Color.BLUE;
}
