package com.vivian.springbootexam.repositories;

import com.vivian.springbootexam.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
