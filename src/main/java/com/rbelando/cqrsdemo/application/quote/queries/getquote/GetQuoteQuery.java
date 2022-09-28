package com.rbelando.cqrsdemo.application.quote.queries.getquote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GetQuoteQuery {
    private Long quoteId;
}
