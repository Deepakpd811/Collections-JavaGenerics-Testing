package com.bridgelab.anotation.intermediate_level.logging_exceution;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)  //  annotation at runtime
@Target(ElementType.METHOD)           // only applied to methods
@interface LogExecutionTime {
}
