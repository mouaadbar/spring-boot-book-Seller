package com.mouaad.bookV2.bookV2.service;



import com.mouaad.bookV2.bookV2.model.Book;

import java.util.List;

/**
 * @author sa
 * @date 3.07.2021
 * @time 18:09
 */
public interface IBookService
{
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
