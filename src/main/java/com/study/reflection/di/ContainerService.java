package com.study.reflection.di;

import java.util.Arrays;

public class ContainerService {

    public static <T> T getObject(Class<T> classType) {
        T instance = create(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
            if (f.getAnnotation(Inject.class) != null) {
                Object filedInstance = create(f.getType());
                f.setAccessible(true);
                try {
                    f.set(instance, filedInstance);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return instance;
    }

    private static <T> T create(Class<T> classType){
        try {
            return classType.getConstructor(null).newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
