package com.study.reflection.porxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("defaultBookService")
public class DefaultBookService implements BookService {

    @Override
    public void rent(Book book) {
        System.out.println("rent = " + book.getTitle());
    }
}
