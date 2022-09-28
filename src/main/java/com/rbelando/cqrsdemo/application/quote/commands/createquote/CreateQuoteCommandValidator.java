package com.rbelando.cqrsdemo.application.quote.commands.createquote;

import com.rbelando.cqrsdemo.application.exceptions.QuoteHasMoreThan40WordsException;
import com.rbelando.cqrsdemo.application.interfaces.CommandValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuoteCommandValidator implements CommandValidator {

    private CreateQuoteCommand createQuoteCommand;

    @Override
    public void validate(CreateQuoteCommand command) {
        if (!this.hasMoreThan40Words(command.getText()))
            throw new QuoteHasMoreThan40WordsException("The quote has more " + "than " + "40 words. Can't be considered as a quote");
    }

    private Boolean hasMoreThan40Words(String text) {
        String[] words = text.split(" ");
        return words.length > 40;
    }


}
