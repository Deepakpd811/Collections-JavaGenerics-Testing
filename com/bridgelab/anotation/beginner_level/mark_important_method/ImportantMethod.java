package com.bridgelab.anotation.beginner_level.mark_important_method;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD)  // Apply only on methods
@interface ImportantMethod {
    String level() default "High"; // set defalut level value to high
}
