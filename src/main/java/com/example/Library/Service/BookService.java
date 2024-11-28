package com.example.Library.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library.Entity.Book;
import com.example.Library.Repository.BookRepo;

public interface BookService {
	Book saveLibrary(Book library);
    List<Book> getAllLibraries();
    
	
	
	
	

}
