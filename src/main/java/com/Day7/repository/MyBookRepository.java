package com.Day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day7.entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{

}
