package com.vivian.springbootexam.repositories;

import com.vivian.springbootexam.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
