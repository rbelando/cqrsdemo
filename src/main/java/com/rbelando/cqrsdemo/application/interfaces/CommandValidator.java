package com.rbelando.cqrsdemo.application.interfaces;

import com.rbelando.cqrsdemo.application.quote.commands.createquote.CreateQuoteCommand;

public interface CommandValidator {
    public void validate(CreateQuoteCommand command);
}
