package com.rbelando.cqrsdemo.application.exceptions;

public class QuoteNotFoundException extends RuntimeException {
    private String message;

    public QuoteNotFoundException() {

    }

    public QuoteNotFoundException(String msg) {
        super(msg);
        this.message = msg;
    }
}
