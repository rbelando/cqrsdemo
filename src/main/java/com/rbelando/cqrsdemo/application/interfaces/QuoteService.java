package com.rbelando.cqrsdemo.application.interfaces;

import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;

public interface QuoteService {
    QuoteDto getQuoteById(Long id);
}
