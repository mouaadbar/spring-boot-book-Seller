package com.mouaad.bookV2.bookV2.service;

import com.mouaad.bookV2.bookV2.model.Book;
import com.mouaad.bookV2.bookV2.repository.IBookRepository;
import com.mouaad.bookV2.bookV2.service.IBookService;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sa
 * @date 3.07.2021
 * @time 18:10
 */
@Service
public class BookService implements IBookService
{
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book)
    {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }
}