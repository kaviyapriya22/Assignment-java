package org.ford.Assignment17;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String nationalty;



    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Book> booksList = new ArrayList<>();

    public Author() {
    }

    public Author(String name, String nationalty,  List<Book> booksList) {
        this.name = name;
        this.nationalty = nationalty;

        this.booksList = booksList;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalty() {
        return nationalty;
    }

    public void setNationalty(String nationalty) {
        this.nationalty = nationalty;
    }



    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
}
