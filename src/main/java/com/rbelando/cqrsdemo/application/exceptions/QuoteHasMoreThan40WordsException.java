package com.rbelando.cqrsdemo.application.exceptions;

public class QuoteHasMoreThan40WordsException extends RuntimeException {
    private String message;

    public QuoteHasMoreThan40WordsException() {

    }

    public QuoteHasMoreThan40WordsException(String msg) {
        super(msg);
        this.message = msg;
    }

}
