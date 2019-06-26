package com.java.training.day2.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface CustomAnnotation { //nu poate extinde alta anotare, pt ca default extinde java.lang.Annotation
   String value();
   int intValue();
}
