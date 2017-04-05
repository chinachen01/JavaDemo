package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by focus on 16/11/17.
 */
@Target(ElementType.TYPE)
public @interface Table {
    public String tableName() default "className";
}
