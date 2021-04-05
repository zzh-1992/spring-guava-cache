package com.grapefruit.annotation;

import java.lang.annotation.*;

/**
 * 标记注解
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Mark {
    String key() default "A";
    String value() default "0";
}
