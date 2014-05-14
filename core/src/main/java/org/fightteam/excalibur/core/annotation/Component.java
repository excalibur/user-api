package org.fightteam.excalibur.core.annotation;

import java.lang.annotation.*;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}
