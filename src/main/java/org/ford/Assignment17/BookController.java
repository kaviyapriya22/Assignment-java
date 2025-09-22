package org.ford.Assignment17;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/members")
public class BookController {

    private BookService bookService;
    private MemberRepo memberRepository;
    private BookRepository bookRepository;

    @Autowired
    public BookController(BookService bookService, MemberRepo memberRepository, BookRepository bookRepository) {
        this.bookService = bookService;
        this.memberRepository = memberRepository;
        this.bookRepository = bookRepository;
    }

    @PostMapping("/{memberId}/borrow/{bookId}")
    public String borrowBook(@PathVariable Integer memberId, @PathVariable Integer bookId) throws BookNotFoundException , ExpiredMembershipException,BorrowingLimitExceededException,DuplicateBorrowException {
        bookService.borrowBook(memberId, bookId);
        return "Book borrowed successfully";
    }

    @DeleteMapping("/{memberId}/return/{bookId}")
    public String returnBook(@PathVariable Integer memberId, @PathVariable Integer bookId) throws BookNotFoundException{
        bookService.returnBook(memberId, bookId);
        return "Book returned successfully";
    }

    @GetMapping("/{memberId}/books")
    public Set<Book> getBorrowedBooks(@PathVariable Integer memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));
        return member.getBorrowedBooks();
    }

    @GetMapping("/books/{bookId}/members")
    public Set<Member> getMembersWhoBorrowed(@PathVariable Integer bookId) throws BookNotFoundException {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
        return book.getBorrowedByMembers();
    }



}
