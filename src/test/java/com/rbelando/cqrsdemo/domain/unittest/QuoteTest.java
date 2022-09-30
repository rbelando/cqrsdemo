package com.rbelando.cqrsdemo.domain.unittest;

import com.rbelando.cqrsdemo.domain.entities.Author;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuoteTest {

    private Quote quote;
    private Author author;

    @BeforeEach
    void init() {
        quote = new Quote();
        author = new Author();
    }

    @Test
    void getId() {
        Long id = 1L;
        quote.setId(id);

        assertEquals(id, quote.getId());
    }

    @Test
    void getText() {
        String text = "I may be wrong but it's highly unlikely";
        quote.setText(text);

        assertEquals(text, quote.getText());
    }

    @Test
    void getAuthor() {
        String authorName = "Kerry Caverga";
        author.setName(authorName);
        quote.setAuthor(author);

        assertEquals(authorName, quote.getAuthor().getName());
    }


}