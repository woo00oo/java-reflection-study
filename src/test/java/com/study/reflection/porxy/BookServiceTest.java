package com.study.reflection.porxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTest {

    @Autowired
    BookServiceProxy bookServiceProxy;

    @Test
    void di() {
        Book book = new Book("spring");
        bookServiceProxy.rent(book);
    }

}