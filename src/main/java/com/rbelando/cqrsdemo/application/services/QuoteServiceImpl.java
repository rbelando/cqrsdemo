package com.rbelando.cqrsdemo.application.services;

import com.rbelando.cqrsdemo.application.exceptions.QuoteNotFoundException;
import com.rbelando.cqrsdemo.application.interfaces.QuoteRepository;
import com.rbelando.cqrsdemo.application.interfaces.QuoteService;
import com.rbelando.cqrsdemo.application.mappers.QuoteMapper;
import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class QuoteServiceImpl implements QuoteService {
    private QuoteRepository quoteRepository;

    @Override
    public QuoteDto getQuoteById(Long id) {
        System.out.println("Get Quote " + id + " handle!");
        Optional<Quote> optionalQuote = quoteRepository.findById(id);
        if (optionalQuote.isPresent()) {
            Quote quote = optionalQuote.get();
            return QuoteMapper.INSTANCE.quoteToQuoteDto(quote);
        }
        throw new QuoteNotFoundException("The quote you requested is not " +
                "found");
    }
}
