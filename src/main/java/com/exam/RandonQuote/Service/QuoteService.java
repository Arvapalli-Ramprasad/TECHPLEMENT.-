package com.exam.RandonQuote.Service;

import com.exam.RandonQuote.Models.QuoteModel;
import com.exam.RandonQuote.Repositories.QuoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepo quoteRepo;
    public QuoteModel addQuote(QuoteModel quoteModel){
        QuoteModel quote = quoteRepo.save(quoteModel);
        return quote;
    }

    public QuoteModel updateQuote(int quoteId, String text){
        QuoteModel quoteModel = quoteRepo.findById(quoteId).get();
        quoteModel.setText(text);
        QuoteModel quoteModel1 = quoteRepo.save(quoteModel);
        return quoteModel1;
    }

    public String deleteQuote(int quoteId){
        quoteRepo.deleteById(quoteId);
        return "Quote Deleted Successfully";
    }

    public QuoteModel getRandomQuote(){
        List<QuoteModel> quoteModels = quoteRepo.findAll();
        Random random =new Random();
        return quoteModels.get(random.nextInt(quoteModels.size()));
    }

    public QuoteModel getQuoteByAuthorName(String author){
        QuoteModel quoteModel = quoteRepo.findByauthor(author);
        return quoteModel;
    }

}
