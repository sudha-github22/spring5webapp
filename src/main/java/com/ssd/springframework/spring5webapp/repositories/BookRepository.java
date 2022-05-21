package com.ssd.springframework.spring5webapp.repositories;

import com.ssd.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
