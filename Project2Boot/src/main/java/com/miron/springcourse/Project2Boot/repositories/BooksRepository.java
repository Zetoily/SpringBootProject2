package com.miron.springcourse.Project2Boot.repositories;

import com.miron.springcourse.Project2Boot.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author Neil Alishev
 */
@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);
}
