package org.ford.Assignment17;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    boolean existsByIsbnAndAuthorId(String isbn, Integer authorId);

}
