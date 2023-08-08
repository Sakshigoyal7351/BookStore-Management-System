package com.Day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Day7.entity.Book;
import com.Day7.entity.MyBookList;
import com.Day7.service.BookService;
import com.Day7.service.MyBookListService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@Autowired
	private MyBookListService myBookListService;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister()
	{
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBook()
	{
		List<Book> list =bookService.getAllBook();
//		ModelAndView m = new ModelAndView();
//		m.setViewName()
		return new ModelAndView("bookList", "book", list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b)
	{
		bookService.save(b);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks()
	{
		return "myBooks";
	}
	
	
	@RequestMapping("/myList/{id}")
	public String getMyList(@PathVariable int id)
	{
		Book b=bookService.getBookById(id);
		MyBookList mb = new MyBookList(b.getId(),b.getName(), b.getAuthor(), b.getPrice());
		myBookListService.saveMyBooks(mb);
		return "redirect:/my_books";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
