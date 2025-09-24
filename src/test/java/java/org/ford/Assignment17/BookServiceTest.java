package com.abc.productapp.librarymanagementsystem;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@SpringBootTest
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;
    @Mock
    private MemberRepo memberRepo;

    @InjectMocks
    private BookService bookService;

    @Test
    void borrowBook_Positive() throws Exception {

        MembershipCard card = new MembershipCard();
        card.setExpiryDate(LocalDate.now().plusDays(10));


        Member member = new Member();
        member.setId(1);
        member.setName("Alice");
        member.setMembershipCard(card);
        member.setBorrowedBooks(new HashSet<>());

        Book book = new Book();
        book.setId(101);
        book.setTitle("Java Basics");
        book.setBorrowedByMembers(new HashSet<>());


        when(memberRepo.findById(1)).thenReturn(Optional.of(member));
        when(bookRepository.findById(101)).thenReturn(Optional.of(book));

        bookService.borrowBook(1, 101);

        //verifying whether the book  added to the meber
        assertTrue(member.getBorrowedBooks().contains(book));

        // verifying whether the member  added to the book
        assertTrue(book.getBorrowedByMembers().contains(member));

        //verifying that save was called
        verify(memberRepo).save(member);
        verify(bookRepository).save(book);
    }

    @Test
    void borrowBook_MemberNotFound() {
        // No memebr
        when(memberRepo.findById(1)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> bookService.borrowBook(1, 101));
    }

    @Test
    void borrowBook_ExpiredMembership() {
        // expired membership card
        MembershipCard expiredCard = new MembershipCard();
        expiredCard.setExpiryDate(LocalDate.now().minusDays(1));

        Member member = new Member();
        member.setId(1);
        member.setMembershipCard(expiredCard);

        Book book = new Book();
        book.setId(101);

        when(memberRepo.findById(1)).thenReturn(Optional.of(member));
        when(bookRepository.findById(101)).thenReturn(Optional.of(book));

        assertThrows(ExpiredMembershipException.class, () -> bookService.borrowBook(1, 101));
    }

    @Test
    void borrowBook_Negative_BorrowingLimitExceeded() {

        MembershipCard card = new MembershipCard();
        card.setExpiryDate(LocalDate.now().plusDays(10));

        Member member = new Member();
        member.setId(1);
        member.setMembershipCard(card);

        // cereating 5 members for a book to test
        Book book = new Book();
        book.setId(101);
        Set<Member> borrowedMembers = new HashSet<>();
        for (int i = 0; i < 5; i++) borrowedMembers.add(new Member());
        book.setBorrowedByMembers(borrowedMembers);

        when(memberRepo.findById(1)).thenReturn(Optional.of(member));
        when(bookRepository.findById(101)).thenReturn(Optional.of(book));

        assertThrows(BorrowingLimitExceededException.class, () -> bookService.borrowBook(1, 101));
    }

    @Test
    void borrowBook_Negative_DuplicateBorrow() {

        MembershipCard card = new MembershipCard();
        card.setExpiryDate(LocalDate.now().plusDays(10));

        //creating members already borrowed this book
        Member member = new Member();
        member.setId(1);
        member.setMembershipCard(card);
        Set<Book> borrowedBooks = new HashSet<>();
        Book book = new Book();
        book.setId(101);
        borrowedBooks.add(book);
        member.setBorrowedBooks(borrowedBooks);

        //making the borrowedByMembers to contain the member
        Set<Member> borrowedBy = new HashSet<>();
        borrowedBy.add(member);
        book.setBorrowedByMembers(borrowedBy);

        when(memberRepo.findById(1)).thenReturn(Optional.of(member));
        when(bookRepository.findById(101)).thenReturn(Optional.of(book));

        assertThrows(DuplicateBorrowException.class, () -> bookService.borrowBook(1, 101));
    }














}

