package com.exam.RandonQuote.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class QuoteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quoteId;
    private String text;
    private String author;

    public QuoteModel() {
    }

    public QuoteModel(int quoteId, String text, String author) {
        this.quoteId = quoteId;
        this.text = text;
        this.author = author;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
