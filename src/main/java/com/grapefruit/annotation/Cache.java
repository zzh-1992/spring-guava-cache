package com.grapefruit.annotation;

import java.lang.annotation.*;

/**
 * 缓存扫描类
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Cache {
}
