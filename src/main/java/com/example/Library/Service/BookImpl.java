package com.example.Library.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Library.Entity.Book;
import com.example.Library.Repository.BookRepo;

@Service
public  class BookImpl implements BookService{
	@Autowired
    private BookRepo libraryRepository;

    @Override
    public Book saveLibrary(Book library) {
        return libraryRepository.save(library);
    }

    @Override
    public List<Book> getAllLibraries() {
        return libraryRepository.findAll();
    }
	
	
	

}
