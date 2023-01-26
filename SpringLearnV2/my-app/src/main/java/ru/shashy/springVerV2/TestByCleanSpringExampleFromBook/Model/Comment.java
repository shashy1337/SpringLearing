package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model;

public class Comment {
    private String author;
    private String text;

    public Comment(String author, String text){
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}