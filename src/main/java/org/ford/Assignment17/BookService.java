package org.ford.Assignment17;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;
    private MemberRepo memberRepository;

    @Autowired
    public BookService(BookRepository bookRepository, MemberRepo memberRepository) {
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
    }

    public void borrowBook(Integer memberId, Integer bookId) throws BookNotFoundException , ExpiredMembershipException,BorrowingLimitExceededException,DuplicateBorrowException{
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        if (member.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())) {
            throw new ExpiredMembershipException("Membership card expired");
        }

        if (book.getBorrowedByMembers().size() >= 5) {
            throw new BorrowingLimitExceededException("Book already borrowed by 5 members");
        }

        if (member.getBorrowedBooks().contains(book)) {
            throw new DuplicateBorrowException("Member already borrowed this book");
        }

        member.getBorrowedBooks().add(book);
        book.getBorrowedByMembers().add(member);

        memberRepository.save(member);
        bookRepository.save(book);
    }


    public void returnBook(Integer memberId, Integer bookId) throws BookNotFoundException {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        member.getBorrowedBooks().remove(book);
        book.getBorrowedByMembers().remove(member);

        memberRepository.save(member);
        bookRepository.save(book);
    }
}

