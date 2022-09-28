package com.rbelando.cqrsdemo.application.quote.commands.createquote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CreateQuoteCommand {
    private Long authorId;
    private String text;
}
