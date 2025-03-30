package com.bridgelab.anotation.intermediate_level.field_validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Available on runtion
@Target(ElementType.FIELD)         // Applied only on fields
@interface MaxLength{
    int value();
}
