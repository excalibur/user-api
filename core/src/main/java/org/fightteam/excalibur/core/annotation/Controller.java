package org.fightteam.excalibur.core.annotation;

import java.lang.annotation.*;

/**
 * controller注解
 *
 * 主要是处理controller的类型
 * 方便dispatcher管理
 *
 * @author faith
 * @since 0.0.1
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Controller {

    String value() default "";
}
