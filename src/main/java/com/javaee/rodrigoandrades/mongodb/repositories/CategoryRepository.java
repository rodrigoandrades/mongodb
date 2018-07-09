package com.javaee.rodrigoandrades.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.rodrigoandrades.mongodb.domain.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
}