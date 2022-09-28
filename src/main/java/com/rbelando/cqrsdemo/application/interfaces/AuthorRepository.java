package com.rbelando.cqrsdemo.application.interfaces;

import com.rbelando.cqrsdemo.domain.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
