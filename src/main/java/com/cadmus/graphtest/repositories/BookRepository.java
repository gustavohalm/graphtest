package com.cadmus.graphtest.repositories;

import com.cadmus.graphtest.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }
