package com.rbelando.cqrsdemo.application.integrationtest;

import com.rbelando.cqrsdemo.application.interfaces.QuoteRepository;
import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;
import com.rbelando.cqrsdemo.application.services.QuoteServiceImpl;
import com.rbelando.cqrsdemo.domain.entities.Author;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class QuoteServiceImplTest {

    @InjectMocks
    private QuoteServiceImpl quoteServiceImpl;

    @Mock
    private QuoteRepository quoteRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenQuoteRequestedThenReturnQuote() throws Exception {
        Long fakeId = 30L;
        Author author = new Author();
        author.setId(fakeId);
        author.setName("Elpo John");
        Quote quote = new Quote(fakeId, "Nothing can't stop me", author);

        when(quoteRepository.findById(fakeId)).thenReturn(Optional.of(quote));

        QuoteDto foundQuote = quoteServiceImpl.getQuoteById(fakeId);

        assertEquals(foundQuote.getQuoteId(), quote.getId());
        assertEquals(foundQuote.getAuthorName(), quote.getAuthor().getName());
        assertEquals(foundQuote.getQuote(), quote.getText());
        verify(quoteRepository, times(1)).findById(fakeId);
    }

}