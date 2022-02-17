package com.gtsasil.dscatalog3.resources;

import com.gtsasil.dscatalog3.entities.Category;
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

    @GetMapping
    public ResponseEntity<List<Category>> findaAll(){
        List<Category> list = new ArrayList<>();
            list.add(new Category(1L, "Books"));
            list.add(new Category(2L, "Eletronics"));

        return ResponseEntity.ok().body(list);
    }
}
