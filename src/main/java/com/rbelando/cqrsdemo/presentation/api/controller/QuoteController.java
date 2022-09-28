package com.rbelando.cqrsdemo.presentation.api.controller;

import com.rbelando.cqrsdemo.application.quote.commands.createquote.CreateQuoteCommand;
import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;
import com.rbelando.cqrsdemo.application.quote.queries.getquote.GetQuoteQuery;
import com.rbelando.cqrsdemo.presentation.api.models.NewQuote;
import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class QuoteController {
    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    @GetMapping("/quotes/{id}")
    public CompletableFuture<QuoteDto> getById(@PathVariable String id) {
        Long _id = Long.parseLong(id);
        return queryGateway.query(new GetQuoteQuery(_id),
                ResponseTypes.instanceOf(QuoteDto.class));
    }

    @PostMapping("/quotes")
    public ResponseEntity<String> post(@RequestBody NewQuote quote) {
        commandGateway.send(new CreateQuoteCommand(quote.getAuthorId(),
                quote.getText()));
        return ResponseEntity.status(HttpStatus.CREATED).body("The quote has "
                + "been created successfully");
    }
}
