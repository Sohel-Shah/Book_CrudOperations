package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.Entity.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
	
}
