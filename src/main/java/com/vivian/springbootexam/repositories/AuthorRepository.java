package com.vivian.springbootexam.repositories;

import com.vivian.springbootexam.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
