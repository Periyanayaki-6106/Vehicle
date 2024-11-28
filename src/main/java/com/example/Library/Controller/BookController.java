package com.example.Library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Library.Entity.Book;
import com.example.Library.Service.BookService;

@RestController
@RequestMapping("/api/vehicles")
public class BookController {
	@Autowired
    private BookService libraryService;

    @PostMapping
    public Book createLibrary(@RequestBody Book library) {
        return libraryService.saveLibrary(library);
    }

    @GetMapping
    public List<Book> getAllLibraries() {
        return libraryService.getAllLibraries();
    }
	 
    
	 
	 


}
