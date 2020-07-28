package com.spring.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.CrudService;
import com.spring.model.Books;
//import com.spring.repository.BooksRepository;

//defining the business logic
@Service
public class BooksService {
//	@Autowired
//	BooksRepository booksRepository;
	
	@Autowired
	CrudService crudService;

//getting all books record by using the method findaAll() of CrudRepository
	public List<Books> getAllBooks() {
		//List<Books> books = new ArrayList<Books>();
		//booksRepository.findAll().forEach(books1 -> books.add(books1));
		return 	crudService.getAllBooks();
	}

	public void insert(Books books){
		crudService.insert(books);
	}

	/*
	 * //getting a specific record by using the method findById() of CrudRepository
	 * public Books getBooksById(int id) { return
	 * booksRepository.findById(id).get(); }
	 * 
	 * //saving a specific record by using the method save() of CrudRepository
	 * public void saveOrUpdate(Books books) { booksRepository.save(books); }
	 * 
	 * //deleting a specific record by using the method deleteById() of
	 * CrudRepository public void delete(int id) { booksRepository.deleteById(id); }
	 * 
	 * //updating a record public void update(Books books, int bookid) {
	 * booksRepository.save(books); }
	 */
}