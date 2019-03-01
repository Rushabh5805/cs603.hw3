package cs603.hw3;

import java.lang.annotation.*;

/**
 * It is an annotation which supports period element with a default value 1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
 public @interface Periodic{
    int period() default 1;
}
