package com.shoufeng.mvc.core.annotation;

import java.lang.annotation.*;

/**
 * @author shoufeng
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFAutowired {
    String value() default "";
}
