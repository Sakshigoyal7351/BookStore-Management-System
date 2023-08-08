package com.Day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day7.entity.Book;

public interface BookRpeository extends JpaRepository<Book, Integer> {

}
