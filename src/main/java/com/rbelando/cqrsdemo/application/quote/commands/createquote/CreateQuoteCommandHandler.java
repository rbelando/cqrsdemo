package com.rbelando.cqrsdemo.application.quote.commands.createquote;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class CreateQuoteCommandHandler {
    @CommandHandler
    public void handle(CreateQuoteCommand command) {
        System.out.println("1 - HANDLING The quote command");
//        Here add all the business logic do we need to create the Quote
    }
}
