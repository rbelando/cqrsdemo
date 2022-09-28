package com.rbelando.cqrsdemo.application.quote.queries.getquote;

import com.rbelando.cqrsdemo.application.interfaces.QuoteService;
import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class GetQuoteQueryHandler {

    private QuoteService quoteService;

    @QueryHandler
    public QuoteDto handle(GetQuoteQuery query) {
        return this.quoteService.getQuoteById(query.getQuoteId());
    }
}
