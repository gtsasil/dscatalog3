package com.gtsasil.dscatalog3.services;

import com.gtsasil.dscatalog3.entities.Category;
import com.gtsasil.dscatalog3.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
