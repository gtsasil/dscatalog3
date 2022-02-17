package com.gtsasil.dscatalog3.resources;

import com.gtsasil.dscatalog3.entities.Category;
import com.gtsasil.dscatalog3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findaAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
