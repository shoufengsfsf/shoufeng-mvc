package com.shoufeng.mvc.core.annotation;

import java.lang.annotation.*;

/**
 * @author shoufeng
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFRequestParam {
    String value() default "";
}
