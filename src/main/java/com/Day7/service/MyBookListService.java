package com.Day7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day7.entity.MyBookList;
import com.Day7.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	MyBookRepository myBookRepository;
	
	
	public void saveMyBooks(MyBookList book)
	{
		myBookRepository.save(book);
	}
}
