package com.hvozdzeu.contentfinder.annotation;

import com.hvozdzeu.contentfinder.enums.Priority;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(
        RetentionPolicy.RUNTIME
)
@Target(
        ElementType.FIELD
)
public @interface FinderMany {

    String[] paths() default "";
    Priority priority();

}
