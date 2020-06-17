package com.shoufeng.mvc.core.annotation;

import java.lang.annotation.*;

/**
 * @author shoufeng
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFRequestMapping {
    String value() default "";
}
