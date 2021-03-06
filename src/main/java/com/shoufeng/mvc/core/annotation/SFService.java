package com.shoufeng.mvc.core.annotation;

import java.lang.annotation.*;

/**
 * @author shoufeng
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFService {
    String value() default "";
}
