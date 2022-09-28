package com.rbelando.cqrsdemo.application.mappers;

import com.rbelando.cqrsdemo.application.quote.queries.QuoteDto;
import com.rbelando.cqrsdemo.domain.entities.Quote;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuoteMapper {

    QuoteMapper INSTANCE = Mappers.getMapper(QuoteMapper.class);

    @Mapping(source = "author.name", target = "authorName")
    @Mapping(source = "text", target = "quote")
    @Mapping(source = "id", target = "quoteId")
    QuoteDto quoteToQuoteDto(Quote quote);
}
