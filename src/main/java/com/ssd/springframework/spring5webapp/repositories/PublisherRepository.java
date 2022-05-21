package com.ssd.springframework.spring5webapp.repositories;

import com.ssd.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
