package com.rbelando.cqrsdemo.bootstrap;

import com.rbelando.cqrsdemo.application.interfaces.AuthorRepository;
import com.rbelando.cqrsdemo.application.interfaces.QuoteRepository;
import com.rbelando.cqrsdemo.domain.entities.Author;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootsrapData implements CommandLineRunner {

    private final QuoteRepository quoteRepository;
    private final AuthorRepository authorRepository;

    public BootsrapData(QuoteRepository quoteRepository,
                        AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
        this.quoteRepository = quoteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Author author1 = new Author();
        author1.setName("Larry Capizza");
        authorRepository.save(author1);
        Quote quote1 = new Quote();
        quote1.setText("Odio que hable cuando interrumpo");
        quote1.setAuthor(author1);
        quoteRepository.save(quote1);
        System.out.println("Quote count: " + quoteRepository.count());
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Quote ID: " + quote1.getId());
    }
}
