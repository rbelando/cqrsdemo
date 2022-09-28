package com.rbelando.cqrsdemo.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class QuoteHasMoreThan40WordsExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(QuoteHasMoreThan40WordsException.class)
    public String handle(QuoteHasMoreThan40WordsException exception) {
        return exception.getMessage();
    }
}
