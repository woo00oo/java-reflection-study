package com.study.reflection.javareflection;

public class Book {

    private static String B = "Book";

    private static final String C = "BOOK";

    private String a = "a";

    private String d = "d";

    protected String e = "e";

    public Book() {
    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("F");
    }

    public void g() {
        System.out.println("g");
    }

    public int h() {
        return 100;
    }
}
