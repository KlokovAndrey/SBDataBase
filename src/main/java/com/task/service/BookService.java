package com.task.service;
import com.task.entity.Book;
import com.task.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book findById(int id){
        Optional<Book> optional = bookRepository.findById(id);
        return optional.orElse(new Book());
    }

    public List<Book> findByName(String name){ return bookRepository.findByName(name); }

    public List<Book> findByCost(int cost){
        return bookRepository.findByCost(cost);
    }

    public List<Book> findByWarehouse(String warehouse){
        return bookRepository.findByWarehouse(warehouse);
    }

    public List<Book> findByNumber(int number) {return bookRepository.findByNumber(number); }

    public void save(Book book){
        bookRepository.save(book);
    }

    public void deleteById(int id){
        bookRepository.deleteById(id);
    }
}
