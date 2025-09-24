package com.abc.productapp.librarymanagementsystem;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class AuthorServiceTest {

    @Mock
    private AuthorRepository authorRepository;
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private AuthorService authorService;

    @Test
    void registerNewAuthor_positiveCase() {
        Author author = new Author();
        author.setName("John");

        when(authorRepository.save(author)).thenReturn(author);

        Author saved = authorService.registerNewAuthor(author);

        assertNotNull(saved);
        assertEquals("John", saved.getName());
        verify(authorRepository).save(author);
    }

    @Test
    void addBooksToAuthor_positiveCase() throws Exception {
        Author author = new Author();
        author.setId(1);
        author.setName("John");
        author.setBooksList(new ArrayList<>());

        Book book = new Book();
        book.setId(101);
        book.setTitle("Java");
        book.setIsbn("12345");

//        find author by ID
//        check if the book already exists
//        set the author to the book
//        save the book

        when(authorRepository.findById(1)).thenReturn(Optional.of(author));
        when(bookRepository.existsByIsbnAndAuthorId("12345", 1)).thenReturn(false);
        when(bookRepository.save(book)).thenReturn(book);

        Book savedBook = authorService.addBooksToAuthor(1, book);
//      checking for title matching
        assertEquals("Java", savedBook.getTitle());
        // verifying book is saved or not
        verify(bookRepository).save(book);
    }

    @Test
    void addBooksToAuthor_AuthorNotFoundCase() {
        // not mocking author just for implementing authr not found case
        Book book = new Book();
        book.setId(101);
        book.setTitle("Java");
        book.setIsbn("12345");
        when(authorRepository.findById(1)).thenReturn(Optional.empty());
        // no author id 1 so throws authorNot found exception
        assertThrows(AuthorNotFoundException.class, () ->
                authorService.addBooksToAuthor(1, book)
        );
    }

    @Test
    void addBooksToAuthor_Negative_BookAlreadyExists() {
        Author author = new Author();
        author.setId(1);
        author.setName("John");

        Book book = new Book();
        book.setId(101);
        book.setTitle("Java");
        book.setIsbn("12345");

        when(authorRepository.findById(1)).thenReturn(Optional.of(author));
        // Mocking that the authorid already has the book
        when(bookRepository.existsByIsbnAndAuthorId("12345", 1)).thenReturn(true);

        assertThrows(BookAlreadyExistsException.class, () ->
                authorService.addBooksToAuthor(1, book)
        );
    }

    @Test
    void findAllBooksByAuthor_Negative_AuthorNotFound() {
        //No author with id 1 so it will throws exception
        when(authorRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(AuthorNotFoundException.class, () ->
                authorService.findAllBooksByAuthor(1)
        );
    }





}
