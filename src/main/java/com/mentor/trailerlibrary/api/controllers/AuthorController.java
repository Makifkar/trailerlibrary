package com.mentor.trailerlibrary.api.controllers;

import com.mentor.trailerlibrary.business.abstracts.AuthorService;
import com.mentor.trailerlibrary.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/authors")
public class AuthorController {
    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {

        Author saveAuthor = authorService.save(author);
        if (author!=null){
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
