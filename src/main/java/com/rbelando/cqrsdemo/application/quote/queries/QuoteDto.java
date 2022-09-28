package com.rbelando.cqrsdemo.application.quote.queries;

public class QuoteDto {
    private Long quoteId;
    private String authorName;
    private String quote;

    public QuoteDto(Long quoteId, String authorName, String quote) {
        this.quoteId = quoteId;
        this.authorName = authorName;
        this.quote = quote;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
