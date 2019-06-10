package com.mum.elibrary.swe.service;

import com.mum.elibrary.swe.model.Book;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BookService {
    public Book save(Book book);
    public Book retrieveSingleBook(Integer id);
    public List<Book> retrieveAllBooks();
    public void delete(Integer id);

}
