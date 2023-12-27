package com.example.catalog.services;

import com.example.catalog.entities.Category;
import com.example.catalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll(){
        return repository.findAll();
    }
}
