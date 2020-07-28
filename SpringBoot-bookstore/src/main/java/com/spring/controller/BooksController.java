package com.spring.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.CrudService;
import com.spring.model.Books;
import com.spring.service.BooksService;

//mark class as Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class BooksController {
//autowire the BooksService class
	@Autowired
	CrudService crudService;

//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/book")
	private List<Books> getAllBooks() {
		return crudService.getAllBooks();
	}
	
	@PostMapping("/add")
	private void insertBook(@RequestBody Books books){
		crudService.insert(books);
	}
	
	@PostMapping("/edit")
	private void editBook(@RequestBody int bookId, @RequestBody Books bookDetail){
		crudService.update(bookId, bookDetail);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	private void deleteBook(@RequestBody int bookId){
		crudService.delete(bookId);
	}
	
	

	/*
	 * //creating a get mapping that retrieves the detail of a specific book
	 * 
	 * @GetMapping("/book/{bookid}") private Books getBooks(@PathVariable("bookid")
	 * int bookid) { return booksService.getBooksById(bookid); }
	 * 
	 * //creating a delete mapping that deletes a specified book
	 * 
	 * @DeleteMapping("/book/{bookid}") private void
	 * deleteBook(@PathVariable("bookid") int bookid) { booksService.delete(bookid);
	 * }
	 * 
	 * //creating post mapping that post the book detail in the database
	 * 
	 * @PostMapping("/books") private int saveBook(@RequestBody Books books) {
	 * booksService.saveOrUpdate(books); return books.getBookid(); }
	 * 
	 * //creating put mapping that updates the book detail
	 * 
	 * @PutMapping("/books") private Books update(@RequestBody Books books) {
	 * booksService.saveOrUpdate(books); return books; }
	 */
}
