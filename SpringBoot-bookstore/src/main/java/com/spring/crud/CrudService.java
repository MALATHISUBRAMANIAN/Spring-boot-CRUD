package com.spring.crud;

import java.sql.SQLException;
import java.util.List;

import com.spring.model.Books;


public interface CrudService {
	
	List<Books> getAllBooks();
	
	void insert(Books book);

	void update(int bookId, Books bookDetail);

	void delete(int bookId);

}
