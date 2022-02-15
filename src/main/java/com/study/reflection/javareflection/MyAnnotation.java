package com.study.reflection.javareflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {

    String age();
}
