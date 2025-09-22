package org.ford.Assignment17;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorRepository authorRepository, BookRepository bookRepository, AuthorService authorService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @PostMapping
    public Author addNewAuthor(@RequestBody Author author) {
        return authorService.registerNewAuthor(author);
    }

    @PostMapping("/{id}/books")
    public Book addBookToAuthor(@RequestBody Book book, @PathVariable Integer id) throws AuthorNotFoundException, BookAlreadyExistsException {
        return authorService.addBooksToAuthor(id,book);

    }


    @GetMapping("/{id}/books")
    public List<Book> getBooksFromAuthor(@PathVariable Integer id) throws AuthorNotFoundException {
        return authorService.findAllBooksByAuthor(id);
    }


}
