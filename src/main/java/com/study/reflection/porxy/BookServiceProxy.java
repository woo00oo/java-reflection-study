package com.study.reflection.porxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceProxy implements BookService{

    @Autowired
    @Qualifier("defaultBookService")
    BookService bookService;

    @Override
    public void rent(Book book) {
        System.out.println("aaaaa");
        bookService.rent(book);
        System.out.println("bbbbb");
    }
}
