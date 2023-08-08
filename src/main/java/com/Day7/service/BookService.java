package com.Day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day7.entity.Book;
import com.Day7.repository.BookRpeository;

@Service
public class BookService {

	@Autowired
	BookRpeository bookRpeository;
	
	public void save(Book b)
	{
		bookRpeository.save(b);
	}
	
	
	public List<Book> getAllBook()
	{
		return bookRpeository.findAll();
	}
	
	public Book getBookById(int id)
	{
		return bookRpeository.findById(id).get();
	}
}
