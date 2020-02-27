package com.cadmus.graphtest.repositories;

import com.cadmus.graphtest.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {}