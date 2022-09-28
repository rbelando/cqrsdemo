package com.rbelando.cqrsdemo.application.interfaces;

import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
}
