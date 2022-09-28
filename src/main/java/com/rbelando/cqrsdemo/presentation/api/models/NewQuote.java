package com.rbelando.cqrsdemo.presentation.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewQuote {
    private Long authorId;
    private String text;
}
