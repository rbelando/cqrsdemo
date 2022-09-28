package com.rbelando.cqrsdemo.domain.unittest;

import com.rbelando.cqrsdemo.domain.entities.Author;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class AuthorTest {

    Author author;
    Quote quote;

    @BeforeEach
    void init() {
        author = new Author();
    }

    @Test
    void getId() {
        Long id = 187L;
        author.setId(id);

        assertEquals(id, author.getId());

    }

    @Test
    void getName() {
        String name = "Rosa Melano";
        author.setName(name);

        assertEquals(name, author.getName());
    }

    @Test
    void getQuotes() {
        Long id = 234L;
        String name = "Benito Camela";
        author.setId(id);
        author.setName(name);

        Long quoteId1 = 32L;
        String quote1 = "When nothing is going right, go left.";
        Long quoteId2 = 31L;
        String quote2 = "My windows aren’t dirty, my dog is painting.";
        Quote[] quoteArray = {new Quote(quoteId1, quote1, author),
                new Quote(quoteId2, quote2, author)};
        Set<Quote> quotes = new HashSet<>(List.of(quoteArray));

        assertThat(quotes, contains(hasProperty("text", is(quote1)),
                hasProperty("text", is(quote2))));
    }

}