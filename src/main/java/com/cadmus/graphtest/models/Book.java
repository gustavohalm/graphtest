package com.cadmus.graphtest.models;

import javax.persistence.*;

@Entity
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String isbn;
    private int pageCount;
    @ManyToOne
    @JoinColumn(name="author_id", nullable = false, updatable = false)
    private Author author;

    public Book(){

    }

    public Book(String title, String isbn, int pageCount, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book{" +
                "id: " +this.id +
                ", title: " + this.title +
                ", isbn: " + this.isbn +
                ", pageCount: " + this.pageCount +
                "}";
    }
}