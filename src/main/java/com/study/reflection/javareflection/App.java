package com.study.reflection.javareflection;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            Arrays.stream(f.getAnnotations()).forEach(a -> {
                if (a instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.age());
                }
            });
        });
    }
}
