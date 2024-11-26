package com.Project.Service;

import com.Project.Model.Book;
import com.Project.Repositary.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class Bookservice {

    @Autowired
    private Bookrepo repo;

    public List<Book> GetTheListOfAllBooks() {
        return repo.findAll();
    }

    public Book FindBooksById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void AddNewBooks(Book add) {
        repo.save(add);
    }

    public void UpdateInTheBooks(Book update) {
        repo.save(update);
    }

    public void DeleteBookById(int id) {
        repo.deleteById(id);
    }

}
