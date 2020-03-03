package com.cadmus.graphtest.resolvers;

import com.cadmus.graphtest.models.Author;
import com.cadmus.graphtest.models.Book;
import com.cadmus.graphtest.repositories.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

import java.util.Optional;

public class BookResolver implements GraphQLResolver<Book>{
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book){
        Optional<Author> optionalAuthor = authorRepository.findById(book.getAuthor().getId());
        return optionalAuthor.orElseGet(Author::new);
    }
}