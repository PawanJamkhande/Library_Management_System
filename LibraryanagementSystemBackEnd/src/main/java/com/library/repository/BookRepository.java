package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.entity.Book;

@Repository
//JpaRepository has methods like save, findById, findAll, delete. it also has custom methods
//it used to generate the query need not to write SQL manually for common operations
public interface BookRepository extends JpaRepository<Book,Long> 
	{
    List<Book> findByBookNameContainingIgnoreCase(String bookName);

    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByCategoryContainingIgnoreCase(String category);

    boolean existsByBookName(String bookName);
		
	}

