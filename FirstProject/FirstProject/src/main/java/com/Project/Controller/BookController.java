package com.Project.Controller;

import com.Project.Model.Book;
import com.Project.Service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/BookStore")
public class BookController {

    @Autowired
    private Bookservice service;

    @GetMapping
    public List<Book> getallthebooks(){
        return service.GetTheListOfAllBooks();
    }

    @GetMapping("/{id}")
    public Book findbookbylist(@PathVariable int id){
        return service.FindBooksById(id);
    }

    @PostMapping
    public void addnewbooks(@RequestBody Book add){
        service.AddNewBooks(add);
    }

    @PutMapping
    public void updateinthebook(@RequestBody Book update){
        service.UpdateInTheBooks(update);
    }

    @DeleteMapping("/id")
    public void deleteBookbyid(@PathVariable int id){
        service.DeleteBookById(id);
    }

}
