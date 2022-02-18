package com.gtsasil.dscatalog3.services;

import com.gtsasil.dscatalog3.dto.CategoryDTO;
import com.gtsasil.dscatalog3.entities.Category;
import com.gtsasil.dscatalog3.repositories.CategoryRepository;
import com.gtsasil.dscatalog3.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){

        List<Category> list = repository.findAll();
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
        // or can be method reference **return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity Not Found"));

        return new CategoryDTO(entity);
    }
}
