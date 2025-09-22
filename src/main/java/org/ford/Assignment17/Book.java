package org.ford.Assignment17;
import java.util.Set;
import java.util.HashSet;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")
    @JsonBackReference
    private Author author;


    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonBackReference
    private Set<Member> borrowedByMembers = new HashSet<>();

    public Book() {
    }

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Member> getBorrowedByMembers() {
        return borrowedByMembers;
    }

    public void setBorrowedByMembers(Set<Member> borrowedByMembers) {
        this.borrowedByMembers = borrowedByMembers;
    }
}
