package com.mum.elibrary.swe.serviceImp;

import com.mum.elibrary.swe.model.Book;
import com.mum.elibrary.swe.repository.BookRepository;
import com.mum.elibrary.swe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book retrieveSingleBook(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }


    @Override
    public List<Book> retrieveAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
