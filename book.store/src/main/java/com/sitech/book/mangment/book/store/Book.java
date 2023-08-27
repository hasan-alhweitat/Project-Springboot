package com.sitech.book.mangment.book.store;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nameBook;
    private int year;
    private String category;

    /// @Column(name="BOOK_NAME", length=50, nullable=false)

    ///@Temporal(TemporalType.DATE)
    ///private Date birthDate;

    ///@Enumerated(EnumType.STRING)
    ///private BookType category;

    public Book() {

    }
    public Book(int id, String nameBook, int year, String category) {
        super();
        this.id= id;
        this.nameBook= nameBook;
        this.year = year;
        this.category= category;
    }
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User [id=" + id +", nameBook=" + nameBook + ", year=" + year +", category=" + category +"]";
    }
}
