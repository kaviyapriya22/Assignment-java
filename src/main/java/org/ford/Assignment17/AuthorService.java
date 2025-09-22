package org.ford.Assignment17;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Author registerNewAuthor (Author author){
        return authorRepository.save(author);
    }

    public Book addBooksToAuthor(Integer authorId, Book book) throws AuthorNotFoundException , BookAlreadyExistsException {

        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found"));
        if (bookRepository.existsByIsbnAndAuthorId(book.getIsbn(), authorId)) {
            throw new BookAlreadyExistsException("Book with ISBN " + book.getIsbn() + " already exists for this author");
        }
        book.setAuthor(author);
        bookRepository.save(book);
        return book;
    }

    public List<Book> findAllBooksByAuthor(Integer authorId) throws AuthorNotFoundException{
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new AuthorNotFoundException("Author Npt found"));
        return author.getBooksList();
    }
}
