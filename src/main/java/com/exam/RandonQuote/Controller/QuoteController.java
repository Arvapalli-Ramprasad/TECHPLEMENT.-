package com.exam.RandonQuote.Controller;

import com.exam.RandonQuote.Models.QuoteModel;
import com.exam.RandonQuote.Service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuoteController {
    @Autowired
    private QuoteService quoteService;

    //Adding Quote

    @PostMapping("addQuote")
    public ResponseEntity addQuote(@RequestBody QuoteModel quoteModel){
        QuoteModel result = quoteService.addQuote(quoteModel);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //Updating Quote

    @PutMapping("updateQuote")
    public ResponseEntity updateQuote(@RequestParam int quoteId, @RequestParam String text){
        QuoteModel quoteModel = quoteService.updateQuote(quoteId,text);
        return new ResponseEntity(quoteModel,HttpStatus.OK);
    }

    //Delete Quote

    @DeleteMapping("deleteQuote")
    public String deleteQuote(@RequestParam int quoteId){
        return quoteService.deleteQuote(quoteId);
    }

    @GetMapping("getRandomQuote")
    public ResponseEntity getRandomQuote(){
//        quoteService.getRandomQuote();
        QuoteModel quoteModel = quoteService.getRandomQuote();
        return new ResponseEntity(quoteModel,HttpStatus.OK);
    }

    @GetMapping("getQuoteByAuthorName")
    public QuoteModel getQuoteByAuthorName(@RequestParam String author){
        QuoteModel quoteModel = quoteService.getQuoteByAuthorName(author);
        return quoteModel;
    }


}
