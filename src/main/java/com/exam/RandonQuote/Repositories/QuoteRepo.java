package com.exam.RandonQuote.Repositories;

import com.exam.RandonQuote.Models.QuoteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepo extends JpaRepository<QuoteModel,Integer> {
    QuoteModel findByauthor(String author);
}
